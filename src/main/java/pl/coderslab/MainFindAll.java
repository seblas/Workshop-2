package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainFindAll {

    public static void main(String[] args) {

        // sprawdzanie działania findAll
        UserDao userDao = new UserDao();
        try {
            User users[] = userDao.findAll();
            int lengthUsers = users.length;
            if(lengthUsers>0) {
                System.out.println("Tablica zawiera " + lengthUsers + " elementów");
                for(User user : users) {
                    System.out.println(user.getId() + " " + user.getUserName() + " " +
                            user.getEmail() + " " + user.getPassword());
                }
            }
            else {
                System.out.println("Tablica jest pusta");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
