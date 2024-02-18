package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDelete {

    public static void main(String[] args) {

        // sprawdzanie działania delete
        UserDao userDao = new UserDao();
        try {
            userDao.delete(17);
            User user = userDao.read(4);
            if(user!=null) {
                System.out.println(user.getId() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getPassword());
            }
            else {
                System.out.println("W bazie brak takiego rekordu");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
