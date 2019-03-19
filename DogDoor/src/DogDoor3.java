import java.util.List;

public class DogDoor3 {

    private boolean open;
    private Bark barkAllowed;
    private List<Bark> barks;

    public DogDoor3(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door is opening");
        open = true;
    }
    public void close(){
        System.out.println("The dog door is closing");
        open = false;
    }

    public void setBarkAllowed(Bark barkAllowed)
    {
        this.barkAllowed = barkAllowed;
    }

    public Bark getBarkAllowed() {
        return barkAllowed;
    }

    public void setBarks(List<Bark> barks) {
        this.barks = barks;
    }

    public List <Bark> getBarksAllowed() {
        return barks;
    }

    //returns the state of the door
    public boolean isOpen(){
        return open;
    }

}
