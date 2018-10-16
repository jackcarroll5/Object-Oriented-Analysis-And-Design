public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private NumString noString;
    private Wood backWood;
    private Wood topWood;

      public GuitarSpec(Builder builder, String model,
                        Type type, NumString noString, Wood backWood, Wood topWood)
      {

          this.builder = builder;
          this.model = model;
          this.type = type;
          this.noString = noString;
          this.backWood = backWood;
          this.topWood = topWood;
      }


    public Builder getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }

    //Enum - String/Electric
    public Type getType(){
        return type;
    }

    public NumString getNumStrings()
    {
        return noString;
    }

    //Enum - Type of wood - Alder, Ash
    public Wood getBackwood(){
        return backWood;
    }
    public Wood getTopwood(){
        return topWood;
    }

    public boolean matches(GuitarSpec spec)
    {
        if(builder != spec.builder)
            return false;

        if ((model != null) && (!model.equals("")) &&
                (!model.equals(spec.model)))
            return false;

        if(type != spec.type)
            return false;

        if(noString != spec.noString)
            return false;

        if(backWood != spec.backWood)
            return false;

        if(topWood != spec.topWood)
            return false;

        return true;
    }
}