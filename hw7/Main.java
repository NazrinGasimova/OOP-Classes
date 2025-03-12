import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player x, Player y) {
        if (x.score != y.score) {
            return y.score - x.score;
        }
        return x.name.compareTo(y.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }
        scanner.close();
        Arrays.sort(players, new Checker());
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
