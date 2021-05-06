import java.util.ArrayList;

public class Office {

    private final Race race;
    private double mult;

    private ArrayList<Bet> bets = new ArrayList<>();

    public Office(Race race, double mult) {
        this.race = race;
        this.mult = mult;
    }

    public void acceptBet(String player, String snail, double amount) {
        bets.add(new Bet(player, snail, amount));
    }

    public void startRace() {
        race.startRace();
    }

    @Override
    public String toString() {
        return  "Race = " + race +
                "\nMultiplicator = " + mult +
                "\nBets: " + bets;
    }

    public void getWinner() {
        String winner = race.getWinner().getName();
        for (Bet bet : bets) {
            if (bet.getSnailname().equals(winner)){
                System.out.println(bet.getPlayername() + " won his bet! He went in with [" + bet.getAmount() + "]"
                + " and won: " + bet.getAmount()*mult);
            }
        }
    }
}
