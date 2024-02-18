package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainUpdate {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        //sprawdzanie działania update
        try {
            User user = userDao.read(11);
            if(user!=null) {
                System.out.println("Poprzednie dane:");
                System.out.println(user.getId() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getPassword());
                user.setUserName("Sebek");
                user.setEmail("seblas119@tlen.pl");
                user.setPassword("hasełko2");
                userDao.update(user);
                System.out.println("Nowe dane:");
                user = userDao.read(11);
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
