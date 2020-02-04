public class Randomizer {

    private static int randomNumber;

    public Randomizer(){
        this.randomNumber = randomNumber;
    }

    public static int getRandomNumber() {
        int min = 0;
        int range = 3;
        randomNumber = (int)(Math.random() * range) + min;

        return randomNumber;
    }
}