import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        sparrow.fly();

        Chicken chicken = new Chicken();
        chicken.fly();
        chicken.eat();

        Fish fish = new Fish();
        fish.swim();


    }
}
