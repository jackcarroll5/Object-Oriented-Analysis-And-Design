import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        createQuestion();

        createChoiceQuestion();


    }



    public static void presentQuestion() {

    }

    public static void createQuestion() {

        Scanner input = new Scanner(System.in);
        String answer;

        Question q1 = new Question();
        q1.setText("What is the capital of France?");
        q1.setAnswer("Paris");

        q1.display();

        answer = input.nextLine();
        q1.checkAnswer(answer);
    }

    public static void createChoiceQuestion() {

        String answer;
        Scanner in = new Scanner(System.in);

        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("\nWhat's the capital of Ireland?");
        System.out.println(q2.getText());



        q2.addChoice("Dublin",true);
        q2.addChoice("London",false);
        q2.addChoice("Paris",false);
        q2.addChoice("Rome",false);


        answer = in.nextLine();
        q2.checkAnswer(answer);
    }


}