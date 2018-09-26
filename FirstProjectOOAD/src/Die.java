public class Die {

    private int faceValue;

    public void roll(){
        faceValue = 1 + (int)(Math.random() * 6);
       // faceValue = (int)(Math.random() * 6) - 1;
        System.out.println(faceValue);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
