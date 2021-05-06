import java.util.ArrayList;

public class Race {

    private final String name;
    private final int maxparticipants;

    private ArrayList<Snail> participants = new ArrayList<>();

    public Race(String name, int maxparticipants) {
        this.name = name;
        this.maxparticipants = maxparticipants;
    }

    public void addSnail(Snail snail) {
        this.participants.add(snail);
    }

    public void removeSnail(String name) {
        for (Snail snail : participants) {
            if (name.equals(snail.getName())){
                participants.remove(snail);
            }
        }
    }

    public void startSnails() {
        for (Snail snail : participants) {
            snail.crawl();
        }
    }

    public Snail getWinner() {
        for (Snail snail : participants) {
            if (snail.getDistance() > 100) {
                return snail;
            }
        }
        return null;
    }

    public void startRace() {
        while (getWinner() == null) {
            startSnails();
        }
        System.out.println("\nThe winner is: " + getWinner().getName());
    }

    public int getMaxparticipants() {
        return maxparticipants;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", maxparticipants=" + maxparticipants +
                ", participants=" + participants +
                '}';
    }
}
