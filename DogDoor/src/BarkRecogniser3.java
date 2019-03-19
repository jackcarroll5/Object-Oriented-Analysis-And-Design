import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BarkRecogniser3 {

        private DogDoor3 door;

        public BarkRecogniser3(DogDoor3 door) {
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
            System.out.println("Bark recogniser heard '" + bark.getSound() + "'");

            List barksAllowed = door.getBarksAllowed();

            for (Iterator i = barksAllowed.iterator(); i.hasNext();)
            {
               Bark allowBark = (Bark) i.next();
                if(allowBark.equals(bark))
                {
                    door.open();
                    return;
                }
            }
            System.out.println("This dog is not allowed at all");
        }

}
