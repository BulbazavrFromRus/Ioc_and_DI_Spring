package spring_introduction;

import org.springframework.stereotype.Component;

//@Component
public class Bird implements Pet{

    public Bird()
    {
        System.out.println("Bird is created");
    }
    @Override
    public void say() {
        System.out.println("Chirik-chirik");
    }
}
