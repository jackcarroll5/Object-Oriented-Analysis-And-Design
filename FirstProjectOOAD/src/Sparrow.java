public class Sparrow extends Bird implements Flyable{

    public Sparrow(){
        super("Sparrow");
    }

    public Sparrow(String name, int age, String gender, int weightInPounds)
    {
        super(name, age, gender, weightInPounds);
    }

     public void fly()
     {
         System.out.println("\n" + getName() + ": " +  "\nThis bad sparrow boy is flying");
     }

}
