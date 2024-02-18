package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainCreate {

    public static void main(String[] args) {

        // sprawdzanie działania create
        User user = new User();
        user.setUserName("Sebastian");
        user.setEmail("seblas17@tlen.pl");
        user.setPassword("hasło");
        UserDao userDao = new UserDao();
        user = userDao.create(user);
        System.out.println("Taki użytkownik został dopisany do bazy:");
        System.out.println(user.getId() + " " + user.getUserName() + " " + user.getEmail() + " " + user.getPassword());
    }
}
