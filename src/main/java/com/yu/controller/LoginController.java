package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yu on 2017/11/20.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

        private static int st = 0;      //静态的
        private int index = 0;          //非静态

        private  static  LoginController loginController = null  ;

        private LoginController( ) {}

        public  static  LoginController getLoginController(){
            System.out.println("进入了"+ st++);
            if(loginController == null) loginController = new LoginController();
            return loginController ;
        }

    @RequestMapping("/test")
    public void test() {

        System.out.println(st++ + " | " + index++);
    }

    public void sayHello(){
        System.out.println("hello world !");
    }

    public static void main(String[] args) {
        System.out.println("aa");
    }

}
