package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

//there will be default bean "dog"
//@Component
public class Dog implements Pet{
    private String name;
    public Dog(){
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

   /* @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }*/
}
