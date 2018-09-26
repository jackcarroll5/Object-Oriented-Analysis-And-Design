public class Animal {

     private String name;
      private int age;
      private String gender;
      private int weightPounds;

      public Animal()
      {

      }

      public Animal(String name)
      {
          this.name = name;
      }

      public Animal(String name, int age, String gender, int weightPounds)
      {
          this.name = name;
          this.age = age;
          this.gender = gender;
          this.weightPounds = weightPounds;
      }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void eat(){
        System.out.println(getName() + ": " + "\nI'm eating here");
      }

      public void sleep()
      {
          System.out.println("Going to dreamland! Need to sleep here");
      }

      public void move()
      {

      }

}
