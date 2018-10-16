public class Question {

  private String text;
  private String answer;


    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void display()
    {
        System.out.println(getText());
    }


    public void checkAnswer(String ans)
    {
        if (getAnswer().equals(ans))
        {
            System.out.println("That is the right answer");
        }
        else {
            System.out.println("That is the wrong answer. \nThe answer is " + getAnswer());
        }

    }


    public static String setQuestion()
    {

        return "";
    }


}
