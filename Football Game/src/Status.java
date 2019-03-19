public enum Status {
    IS_INJURED, IS_SUSPENDED,HAS_RED_CARD,CAN_PLAY;


    public String toString() {
        switch (this)
        {
            case IS_INJURED:
                return "IS_INJURED";


            case IS_SUSPENDED:
                return "IS_SUSPENDED";

            case HAS_RED_CARD:
                return "HAS_RED_CARD";

            case CAN_PLAY:
                return "CAN_PLAY";

            default:
                return "";
        }



    }
}
