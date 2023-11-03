package com.an.Util;

import com.an.Main;
import com.an.model.User;
import com.an.service.UserService;
import com.an.service.UserServiceImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class InitDatabase {
    private static final AnnotationConfigApplicationContext context = Main.getContext();
    private static final UserService userService = context.getBean(UserServiceImp.class);

    public static void initialFillingDatabase() {

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
        userService.addUser(user4);
    }
}
