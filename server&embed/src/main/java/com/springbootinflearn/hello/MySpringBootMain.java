package com.springbootinflearn.hello;

import com.springbootinflearn.hello.boot.MySpringApplication;
import com.springbootinflearn.hello.boot.MySpringBootApplication;

@MySpringBootApplication
public class MySpringBootMain {

    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
