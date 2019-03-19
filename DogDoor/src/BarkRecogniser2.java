import java.util.Timer;
import java.util.TimerTask;

public class BarkRecogniser2 {

        private DogDoor2 door;

        public BarkRecogniser2(DogDoor2 door) {
            this.door = door;
        }

        public void pressButton() {
            System.out.println("Pressing the remote control button....");

            if (door.isOpen())
                door.close();
            else {
                door.open();


                final Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    public void run() {
                        door.close();
                        timer.cancel();
                    }
                }, 5000);


            }
        }

        public void recognise(Bark bark)
        {
            System.out.println("\nBark recogniser heard '" + bark.getSound() + "'");

            if(door.getBarkAllowed().equals(bark))
            {
                door.open();
            }
            else
                System.out.println("\nThe dog is not allowed to enter the house");

        }

}
