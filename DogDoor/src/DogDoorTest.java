public class DogDoorTest {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Rover barks to go outside....");
        remote.pressButton();


        System.out.println("\nRover has gone outside....");
        //remote.pressButton();


        System.out.println("\nRover has done his business....");
        //remote.pressButton();


        System.out.println("\nRover is back inside....");
        //remote.pressButton();

    }
}
