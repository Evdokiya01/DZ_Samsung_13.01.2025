import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Game game = new Game(player);

        game.start();

        scanner.close();
    }
}
