import java.util.Timer;
import java.util.TimerTask;

public class BarkRecogniser {

        private DogDoor door;

        public BarkRecogniser(DogDoor door) {
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

        public void recognise(String bark)
        {
            System.out.println("\nBark recogniser heard '" + bark + "'");
            door.open();

        }

}
