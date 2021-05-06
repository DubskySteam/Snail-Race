import java.util.Random;

public class Snail {

    private final String name;
    private final String race;
    private final int velocity;
    private double distance = 0;

    public Snail(String name, String race, int velocity) {
        this.name = name;
        this.race = race;
        this.velocity = velocity;
    }

    public void crawl() {
        Random rand = new Random();
        this.distance += velocity * (rand.nextInt(100) + 1) / 100;
        System.out.println(name + " " + distance);
    }

    @Override
    public String toString() {
        return "Snail {" +
                "Name ='" + name + '\'' +
                ", Race = '" + race + '\'' +
                ", Velocity = " + velocity +
                ", Distance = " + distance +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getVelocity() {
        return velocity;
    }

    public double getDistance() {
        return distance;
    }
}
