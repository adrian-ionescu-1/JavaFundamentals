package Loops;

import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Random random = new Random();
        int dice1;
        int dice2;
        int dice3;
        int count = 0;

        do {
            dice1 = random.nextInt(1,7);
            dice2 = random.nextInt(1,7);
            dice3 = random.nextInt(1,7);
            count ++;
            System.out.println("Primul zar este: " + dice1 + " si al doilea este: " + dice2 + " al treilea zar este: " + dice3);
        } while (!(dice1 == dice2 && dice2 == dice3));
        System.out.println("Finish. Ai aruncat zarurile de " + count);
    }
}
