public class Player {

    private String name;
    private Status currentStatus;


    public Player(String name, Status currentStatus) {
        this.name = name;
        this.currentStatus = currentStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Status getStatus()
    {
        return currentStatus;
    }



    public boolean canPlay()
    {
        return currentStatus == Status.CAN_PLAY;
    }

    public boolean isInjured()
    {
        return currentStatus == Status.IS_INJURED;
    }

    public boolean hasRedCard()
    {
        return currentStatus == Status.HAS_RED_CARD;
    }

    public boolean isSuspended()
    {
        return currentStatus == Status.IS_SUSPENDED;
    }


}
