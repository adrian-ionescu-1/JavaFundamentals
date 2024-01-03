package ExercisesTest;

import java.util.Random;

public class MonopolyRoll {

    public static void main(String[] args) {

        int result = monopolyRoll();
        if (result == -1) {
            System.out.println("Player goes to jail!");
        } else {
            System.out.println("Total rolled: " + result);
        }
    }

    public static int diceRoll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static int monopolyRoll() {
        int totalRolled = 0;
        int consecutiveDoubles = 0;

        while (true) {
            int roll1 = diceRoll();
            int roll2 = diceRoll();
            totalRolled += roll1 + roll2;

            if (roll1 == roll2) {
                consecutiveDoubles++;
                if (consecutiveDoubles == 3) {
                    return -1;
                }
            } else {
                return totalRolled;
            }
        }
    }
}
