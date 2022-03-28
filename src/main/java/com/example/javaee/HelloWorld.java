package com.example.javaee;
import javax.ejb.*;

@Local
public interface HelloWorld {
    public String sayHelloWorld();
}