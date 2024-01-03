package Loops;

import java.util.Scanner;

public class CountBlocks {

    public static void main(String[] args) {

        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul de nivele a piramidei pentru calculul cuburilor");
        int levels = scan.nextInt();

        for (int i = 1; i <= levels; i++) {
            result += i*i;
        }
        System.out.println(result);
    }
}
