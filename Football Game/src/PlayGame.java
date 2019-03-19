public class PlayGame {

   private FootballTeam homeTeam;
   private FootballTeam awayTeam;

    public final int H_TEAM = 11;
    public final int A_TEAM = 11;

    public final float H_SEND_OFF_CHANCE = 0.98f;
    public final float A_SEND_OFF_CHANCE = 0.98f;

    boolean play = true;

    public FootballTeam getAwayTeam() {
        return awayTeam;
    }

    public FootballTeam getHomeTeam() {
        return homeTeam;
    }

    void playGame() {
        while (!play) {
            // hometeam randomly scores a goal
            if (Math.random() < homeTeam.getScoreProbability())
            {
                homeTeam.scoreGoal();
            }
            // awayTeam randomly scores a goal
            if (Math.random() < awayTeam.getScoreProbability())
            {
                awayTeam.scoreGoal();
            }

            for (int i = 0; i < H_TEAM; i++)
            {
                if (Math.random() > H_SEND_OFF_CHANCE)
                {
                   homeTeam.getHomeTeam().playerGetsSentOff();
                }
            }

            for (int i = 0; i < A_TEAM; i++)
            {
                if (Math.random () > A_SEND_OFF_CHANCE)
                {
                    awayTeam.getAwayTeam().playerGetsSentOff();
                }
            }
        }
    }


}
