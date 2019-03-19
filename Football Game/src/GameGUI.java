import javax.swing.*;

public class GameGUI extends JFrame{

    private JTextArea jta = new JTextArea();

    private PlayGame game;

    private GameGUI gameUI;


    public GameGUI(PlayGame game)
    {
        this.game = game;
    }

    public void display() {
        for (Player player: game.getHomeTeam().getTeam())
            gameUI.addText(player.getName());

        for (Player player: game.getAwayTeam().getTeam())
            gameUI.addText(player.getName());

        this.add(jta);
    }

    public void setGame(PlayGame game) {
        this.game = game;
    }

    public PlayGame getGame() {
        return game;
    }

    public void addText(String text)
    {
        jta.append(text);
    }

    public void setGameUI(GameGUI gameUI) {
        this.gameUI = gameUI;
    }

    public GameGUI getGameUI() {
        return gameUI;
    }


    public JTextArea getJta() {
        return jta;
    }

    public void setJta(JTextArea jta) {
        this.jta = jta;
    }
}
