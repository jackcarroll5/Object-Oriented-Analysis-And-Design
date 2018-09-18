public class Chicken extends Bird{

    public Chicken()
    {
        super("Chicken");
    }

    public Chicken(String name)
    {
        super(name);
    }

     public void fly()
     {
         System.out.println("\n" + getName() + ": " +  "\nThis chicken can't fly! It's not a Batman");
     }

}
