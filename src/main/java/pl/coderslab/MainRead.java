package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainRead {

    public static void main(String[] args) {

        // sprawdzanie działania read
        UserDao userDao = new UserDao();
        try {
            User user = new User();
            user = userDao.read(5);
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
