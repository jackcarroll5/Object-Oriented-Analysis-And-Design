public class DogDoorTest2 {
    public static void main(String[] args) {
        DogDoor2 door = new DogDoor2();
        BarkRecogniser2 recogniser = new BarkRecogniser2(door);

        Bark bark = new Bark("Woof");
        Bark bark2 = new Bark("Yip Yip");

        bark.setSound("Woof");
        System.out.println("The bark is set to " + bark.getSound());


        door.setBarkAllowed(bark);
        System.out.println("Rover is waiting to go out....");
        recogniser.recognise(bark);

        recogniser.recognise(bark2);


        System.out.println("\nRover has gone outside....");

        System.out.println("\nRover has done his business....");


        //Alt path starts here
        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e){};

        System.out.println(".....but he is stuck outside");
        System.out.println("\nRover barks to get back inside....");
        recogniser.recognise(bark);

        System.out.println("\n.... so Mary presses the remote control....");
        recogniser.pressButton();

        System.out.println("\nRover is back inside....");
    }
}
