public class Bet {

    private String playername;
    private String snailname;
    private double amount;

    public Bet(String playername, String snailname, double amount) {
        this.playername = playername;
        this.snailname = snailname;
        this.amount = amount;

        if (amount <= 0)
        {
            throw new IllegalArgumentException("You must bet more than 0!");
        }

    }

    public String getPlayername() {
        return playername;
    }

    public String getSnailname() {
        return snailname;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "playername='" + playername + '\'' +
                ", snailname='" + snailname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
