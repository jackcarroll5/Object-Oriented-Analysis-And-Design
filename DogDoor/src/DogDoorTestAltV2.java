public class DogDoorTestAltV2 {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecogniser recogniser = new BarkRecogniser(door);

        System.out.println("Rover is waiting to go out....");
       recogniser.recognise("Woof");

        recogniser.recognise("Yip Yip");

        System.out.println("\nRover has gone outside....");



        System.out.println("\nRover has done his business....");


        //Alt path starts here
        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e){};

        System.out.println(".....but he is stuck outside");
        System.out.println("\nRover barks to get back inside....");
        recogniser.recognise("Woof");

        System.out.println("\n.... so Mary presses the remote control....");


        System.out.println("\nRover is back inside....");
        recogniser.pressButton();
    }

}
