import java.util.Random;

public class NumberGenerator {

    private int numberToGuess;

    public NumberGenerator() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(100) + 1;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }
}
