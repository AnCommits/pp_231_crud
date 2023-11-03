package com.an;

import com.an.web.config.AppConfig;
import com.an.web.model.User;
import com.an.web.service.UserService;
import com.an.web.service.UserServiceImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        final UserService userService = context.getBean(UserServiceImp.class);

        Calendar birthDay1 = new GregorianCalendar(1879, Calendar.MARCH, 14);
        User user1 = new User("Альберт", "Эйнштейн", "albert_einstein@gmail.com",
                birthDay1.getTime(), new Date());

        Calendar birthDay2 = new GregorianCalendar(287, Calendar.JANUARY, 1);
        User user2 = new User("Архимед", null, "archimedes@pigeon.org",
                birthDay2.getTime(), new Date());
        user2.setEraBc(true);


        Calendar birthDay3 = new GregorianCalendar(1452, Calendar.APRIL, 15);
        User user3 = new User("Леонардо", "да Винчи", "leonardo_di_ser_piero_da_vinci@yahoo.com",
                birthDay3.getTime(), new Date());


        Calendar birthDay4 = new GregorianCalendar(1856, Calendar.JULY, 10);
        User user4 = new User("Никола", "Тесла", "nikola_tesla@tesla.edu",
                birthDay4.getTime(), new Date());

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        User user102 = userService.getUserById(2);
        System.out.println(user2);
        user102.setLastName("Сиракузский");
        user102.setEmail("archimedes_siracusa@eureka.edu");
        userService.updateUser(user102);
        User user202 = userService.getUserById(user102.getId());
        System.out.println(user202);
    }
}
