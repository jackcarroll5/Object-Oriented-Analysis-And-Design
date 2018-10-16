public enum Wood {
    ALDER, CEDAR, MAHOGANY;

    public String toString()
    {
        switch (this)
        {
            case ALDER:
                return "ALDER";


            case CEDAR:
                    return "CEDAR";

            case MAHOGANY:
                  return "MAHOGANY";

            default:
                return "";
        }

    }
}
