public class DogDoor2 {

    private boolean open;
    private Bark barkAllowed;

    public DogDoor2(){
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

    //returns the state of the door
    public boolean isOpen(){
        return open;
    }

}
