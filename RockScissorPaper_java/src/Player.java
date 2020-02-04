public class Player {

    private String name;
    private int gameChoice;
    private int victory = 0;

    public Player(String name) {
        this.name = name;
        this.gameChoice = gameChoice;
    }

    public String getName() {
        return name;
    }

    public int getGameChoice() {
        return gameChoice = Randomizer.getRandomNumber();
    }

    public void win() {
        victory++;
    }

    public int getVictory(){
        return victory;
    }
}
