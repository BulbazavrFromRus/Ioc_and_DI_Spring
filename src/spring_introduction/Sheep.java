package spring_introduction;

public class Sheep implements Pet {

    public Sheep() {
        System.out.println("Sheep is created sheep");
    }

    @Override
    public void say() {
        System.out.println("Be-Be-Be");
    }

}
