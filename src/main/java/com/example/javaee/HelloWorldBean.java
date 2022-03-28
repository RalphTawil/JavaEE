package com.example.javaee;
import javax.ejb.*;

@Stateless
public class HelloWorldBean implements  HelloWorld{

    @Override
    public String sayHelloWorld() {
        return "Hello World from Karl and Ralph ";
    }
}
