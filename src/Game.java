import java.util.Scanner;

public class Game {
    private NumberGenerator numberGenerator;
    private Player player;

    public Game(Player player) {
        this.numberGenerator = new NumberGenerator();
        this.player = player;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = numberGenerator.getNumberToGuess();
        boolean hasGuessedCorrectly = false;

        System.out.println("Добро пожаловать в игру 'Угадай число', " + player.getName() + "!");
        System.out.println("Я загадала число от 1 до 100. Попробуйте угадать его!");

        while (!hasGuessedCorrectly) {
            System.out.print("Введите ваше предположение: ");
            int playerGuess = scanner.nextInt();
            player.incrementTries();

            if (playerGuess < numberToGuess) {
                System.out.println("Слишком низко! Попробуйте еще раз.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Слишком высоко! Попробуйте еще раз.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Поздравляю," + player.getName() + "! Вы угадали число " + numberToGuess + " за " + player.getNumberOfTries() + " попыток.");
            }
        }

        scanner.close();
    }
}
