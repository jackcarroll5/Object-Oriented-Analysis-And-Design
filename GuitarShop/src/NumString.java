public enum NumString {

    SIXSTRING,TWELVESTRING;


    public String toString()
    {
        switch (this)
        {
            case SIXSTRING:
                return "SIXSTRING";


            case TWELVESTRING:
                return "TWELVESTRING";

            default:
                return "";
        }

    }
}
