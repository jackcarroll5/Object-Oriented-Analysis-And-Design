public abstract class Bird extends Animal{

    protected Bird()
    {

    }

    public Bird(String name, int age, String gender, int weightInPounds)
    {
        super(name, age, gender, weightInPounds);
    }

    protected Bird(String name)
    {
        super(name);
    }

    public void fly()
    {
        System.out.println("\nI can test my flying!");
    }

    public void move()
    {
        System.out.println("Bird: This animal can flap and move its wings");
    }

}
