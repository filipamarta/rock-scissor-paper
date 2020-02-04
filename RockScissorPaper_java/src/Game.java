public class Game {

    private Player player1;
    private Player player2;
    private RockPaperScissor game;


    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){
        handChoice();
    }


    public void handChoice(){
        int round = 0;
        int hand1;
        int hand2;
        int scorePlayer1;
        int scorePlayer2;

        for (int i = 0; i < 5; i++) {
            round++;

            hand1 = player1.getGameChoice();
            RockPaperScissor[] choice1 = RockPaperScissor.values();
            RockPaperScissor result1 = choice1[hand1];

            hand2 = player2.getGameChoice();
            RockPaperScissor[] choice2 = RockPaperScissor.values();
            RockPaperScissor result2 = choice2[hand2];
            System.out.println("###########################################");
            System.out.println("Round: " + round);
            System.out.println(player1.getName() + ": " + result1);
            System.out.println(player2.getName() + ": " + result2);


            if (result1 == RockPaperScissor.ROCK && result2 == RockPaperScissor.PAPER){
                player2.win();
                System.out.println(">>> " + player2.getName() + " won with " + RockPaperScissor.PAPER + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.ROCK && result2 == RockPaperScissor.SCISSOR){
                player1.win();
                System.out.println(">>> " + player1.getName() + " won with " + RockPaperScissor.ROCK + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.SCISSOR && result2 == RockPaperScissor.PAPER){
                player1.win();
                System.out.println(">>> " + player1.getName() + " won with " + RockPaperScissor.SCISSOR + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.SCISSOR && result2 == RockPaperScissor.ROCK){
                player2.win();
                System.out.println(">>> " + player2.getName() + " won with " + RockPaperScissor.ROCK + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.PAPER && result2 == RockPaperScissor.ROCK){
                player1.win();
                System.out.println(">>> " + player1.getName() + " won with " + RockPaperScissor.PAPER + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.PAPER && result2 == RockPaperScissor.SCISSOR){
                player2.win();
                System.out.println(">>> " + player2.getName() + " won with " + RockPaperScissor.SCISSOR + "!!");
                continue;
            }
            if (result1 == RockPaperScissor.ROCK && result2 == RockPaperScissor.ROCK
                    || result1 == RockPaperScissor.PAPER && result2 == RockPaperScissor.PAPER
                    || result1 == RockPaperScissor.SCISSOR && result2 == RockPaperScissor.SCISSOR){
                System.out.println(">>> game tied! No winners here...");
                continue;
            }
        }
        scorePlayer1 = player1.getVictory();
        scorePlayer2 = player2.getVictory();
        System.out.println("######################################################################################");
        System.out.println("Total victories of " + player1.getName() + ": " + scorePlayer1);
        System.out.println("Total victories of " + player2.getName() + ": " + scorePlayer2);
        System.out.println("######################################################################################");
    }
}
