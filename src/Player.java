public class Player {
    private String name;
    private int numberOfTries;

    public Player(String name) {
        this.name = name;
        this.numberOfTries = 0;
    }

    public void incrementTries() {
        numberOfTries++;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public String getName() {
        return name;
    }
}
