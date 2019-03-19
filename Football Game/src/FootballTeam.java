import java.util.ArrayList;

public class FootballTeam {

    private FootballTeam homeTeam;
    private FootballTeam awayTeam;
   //private final String name;
    private ArrayList<Player> team;
   private int score = 0;
   private float scoreProbability;

    public FootballTeam(FootballTeam homeTeam,FootballTeam awayTeam) {
        this.team = new ArrayList<Player>();
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        initializeFromDB();
    }

    public void initializeFromDB() {
        // initialize the teams list of players
        // sets the scoreProbability
        Player player = new Player("Johnny",Status.CAN_PLAY);
        Player player2 = new Player("Wayne",Status.CAN_PLAY);

        team.add(player);
        team.add(player2);
        addPlayer(player);
        addPlayer(player2);


        setScoreProbability(0.75f);
    }

    public void addPlayer(Player player) {
        if (player.canPlay()) {
           team.add(player);
        }
    }



    public void setScoreProbability(float scoreProbability) {
        this.scoreProbability = scoreProbability;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }


    public ArrayList<Player> getTeam() {
        return team;
    }

    /*public String getName() {
        return name;
    }*/

    public float getScoreProbability() {
        return scoreProbability;
    }

    public void scoreGoal() {
        score++;
    }

    public void setHomeTeam(FootballTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(FootballTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public FootballTeam getHomeTeam() {
        return homeTeam;
    }

    public FootballTeam getAwayTeam() {
        return awayTeam;
    }

    public void playerGetsSentOff() {
        // code to handle player being sent off
        // not implemented yet     }

        /*Player player;
        if (player.getStatus() == 3) {
            team.remove(player);
        }*/
    }
}
