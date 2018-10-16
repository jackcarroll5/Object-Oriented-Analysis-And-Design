public enum Builder {
    FENDER,GIBSON,MARTIN,COLLINGS;


    public String toString()
    {
        switch (this)
        {
            case FENDER:
                return "FENDER";

            case GIBSON:
                return "GIBSON";

            case MARTIN:
                return "MARTIN";

            case COLLINGS:
                return "COLLINGS";

            default:
                return "";
        }

    }
}
