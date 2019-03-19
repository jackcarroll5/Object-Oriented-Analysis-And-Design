public class DogDoorTesterAlt {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Rover barks to go outside....");
        remote.pressButton();


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

        remote.pressButton();
        System.out.println("\nRover is back inside....");
    }



}
