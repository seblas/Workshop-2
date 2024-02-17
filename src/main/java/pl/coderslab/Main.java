package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Sebastian");
        user.setEmail("seblas@tlen.pl");
        user.setPassword("hasło");
        UserDao userDao = new UserDao();
        userDao.create(user);
    }

}
