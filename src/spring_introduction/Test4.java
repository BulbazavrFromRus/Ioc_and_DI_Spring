package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
       Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

       /* myDog.setName("Belka");
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/
        //System.out.println("Variable link to one object? " + (myDog==yourDog));
        context.close();
    }
}
