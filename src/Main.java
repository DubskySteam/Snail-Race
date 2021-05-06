import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> players = new ArrayList<>();

        System.out.println("Amount of players: ");
        int playeramount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < playeramount; i++) {
            System.out.println("Player " + i + ": ");
            String tmpName = scanner.nextLine();
            players.add(tmpName);
        }

        Race race = new Race("Snail Grand Prix", 2);
        dynamicSnailAddition(race);

        Office office = new Office(race, 1.56);
        dynamicBets(office, players);

        System.out.println(office);

        office.startRace();
        office.getWinner();

    }

    public static void dynamicSnailAddition(Race race) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < race.getMaxparticipants(); i++) {
            System.out.println("Snail name: ");
            String name = scanner.nextLine();
            System.out.println("Snail race: ");
            String race_ = scanner.nextLine();
            System.out.println("Snail velocity: ");
            int vel = scanner.nextInt();
            race.addSnail(new Snail(name, race_, vel));
            scanner.nextLine();
        }
    }

    public static void dynamicBets(Office office, ArrayList<String> players){
        Scanner scanner = new Scanner(System.in);
        for (String player : players) {
            System.out.println("["+player+"'s Bet]");
            System.out.println("Snail name: ");
            String name = scanner.nextLine();
            System.out.println("Amount: ");
            double amount = scanner.nextDouble();
            office.acceptBet(player, name, amount);
            scanner.nextLine();
        }
    }


}
