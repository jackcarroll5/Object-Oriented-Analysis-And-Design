import javax.swing.*;

public class Driver {

    public static void main(String[] args) {

        PlayGame game = new PlayGame();


        GameGUI gameGUI = new GameGUI(game);
        gameGUI.setVisible(true);
        gameGUI.display();
        gameGUI.setTitle("Football Game");
        gameGUI.setSize(1000,1000);
        gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }



}
