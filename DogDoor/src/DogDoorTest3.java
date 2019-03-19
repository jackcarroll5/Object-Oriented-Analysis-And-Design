import java.util.LinkedList;
import java.util.List;

public class DogDoorTest3 {
    public static void main(String[] args) {
        DogDoor3 door = new DogDoor3();
        BarkRecogniser3 recogniser = new BarkRecogniser3(door);
        List<Bark> barks = new LinkedList<Bark>();
        Bark bark = new Bark("Woof");
        Bark bark2 = new Bark("Yip Yip");
        Bark bark3 = new Bark("Ow Ow");

        barks.add(0,bark);
        barks.add(1,bark2);
        barks.add(2,bark3);

        door.setBarks(barks);

        door.setBarkAllowed(bark);



        System.out.println("Rover is waiting to go out....");
        recogniser.recognise(bark);
        if (!bark.equals(bark3))
        {
            System.out.println("\nThe other dog will not enter the house");
        }



        System.out.println("\nRover has gone outside....");



        System.out.println("\nRover has done his business....");


        //Alt path starts here
        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e){};

        System.out.println(".....but he is stuck outside");
        System.out.println("\nRover barks to get back inside....");


        System.out.println("\n.... so Mary presses the remote control....");


        System.out.println("\nRover is back inside....");
    }



}
