package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;

   @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


   public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }



    public void callYourPet(){
        System.out.println("Hello my lovely pet!");
        pet.say();
    }


    /*@Autowired
    @Qualifier("bird")*/
    public void setPet(Pet pet) {
        System.out.println("Class Person: any other method");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person:  Set age");
        this.age = age;
    }
}
