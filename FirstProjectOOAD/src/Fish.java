public class Fish extends Animal {

    protected Fish()
    {

    }

    public Fish(String name, int age, String gender, int weightInPounds)
    {
        super(name, age, gender, weightInPounds);
    }

    protected Fish(String name)
    {
        super(name);
    }

    public void swim()
    {
        System.out.println("\nFish: Swimming mad in the water");
    }

    public void move()
    {
        System.out.println("Fish: This fish can move fast");
    }
}
