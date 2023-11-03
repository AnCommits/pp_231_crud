package com.an;

import com.an.config.AppConfig;
import com.an.model.User;
import com.an.service.UserService;
import com.an.service.UserServiceImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.an.Util.InitDatabase;

public class Main {

    private final static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    private final static UserService userService = context.getBean(UserServiceImp.class);

    public static AnnotationConfigApplicationContext getContext() {
        return context;
    }

    public static void main(String[] args) {

        InitDatabase.initialFillingDatabase();

        User user102 = userService.getUserById(2);
        user102.setLastName("Сиракузский");
        user102.setEmail("archimedes_siracusa@eureka.edu");
        userService.updateUser(user102);
        userService.removeUserById(3);
    }
}
