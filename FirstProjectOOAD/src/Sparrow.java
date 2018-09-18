public class Sparrow extends Bird implements Flyable{

    public Sparrow(){
        super("Sparrow");
    }

     public void fly()
     {
         System.out.println(getName() + ": " +  "\nThis bad sparrow boy is flying");
     }

}
