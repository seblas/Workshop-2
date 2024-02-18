package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // sprawdzanie działania create
        User user = new User();
        user.setUserName("Sebastian");
        user.setEmail("seblas15@tlen.pl");
        user.setPassword("hasło");
        UserDao userDao = new UserDao();
        user = userDao.create(user);
        System.out.println(user.getId() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getPassword());

        // sprawdzanie działania read
        UserDao userDao2 = new UserDao();
        try {
            User user2;
            user2 = userDao2.read(50);
            if(user2!=null) {
                System.out.println(user2.getId() + " " + user2.getUserName() + " " + user2.getEmail() + " " + user2.getPassword());
            }
            else {
                System.out.println("W bazie brak takiego rekordu");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        //sprawdzanie działania update
        try {
            user = userDao.read(5);
            if(user!=null) {
                System.out.println("Poprzednie dane:");
                System.out.println(user.getId() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getPassword());
                user.setUserName("Sebek");
                user.setEmail("seblas111@tlen.pl");
                user.setPassword("hasełko");
                userDao.update(user);
            }
            else {
                System.out.println("W bazie brak takiego rekordu");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
