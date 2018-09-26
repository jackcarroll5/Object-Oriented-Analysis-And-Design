import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {

        Animal animal1 = new Animal("Jonah", 6, "M", 150);
        animal1.eat();
        animal1.sleep();
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.move();

        Animal sparrow1 = new Sparrow("Lacey",6,"F",10);
        ((Sparrow) sparrow1).move();

        Chicken chicken = new Chicken();
        chicken.fly();
        chicken.eat();

        Fish fish = new Fish();
        fish.swim();
        fish.move();

        Animal fish1 = new Fish("Ciara", 7, "F", 45);
        ((Fish) fish1).move();

    }

    public static void moveAnimals(Animal animal)
    {
        animal.move();
    }


}
