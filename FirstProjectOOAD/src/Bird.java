public abstract class Bird extends Animal{

    protected Bird()
    {

    }

    protected Bird(String name)
    {
        super(name);
    }

    public void fly()
    {
        System.out.println("\nI can test my flying!");
    }

}
