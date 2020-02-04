public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Buzz Lightyear");
        Player player2 = new Player("Mr. Potato Head");

        Game game = new Game(player1, player2);
        game.start();
    }
}
