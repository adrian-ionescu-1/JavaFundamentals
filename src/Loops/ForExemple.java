package Loops;

public class ForExemple {

    public static void main(String[] args) {

        for ( int i = 10; i > 0; i--) {
            if (i == 5) {
                return;
            }
            System.out.println("Hello World " + i);
        }

        System.out.println("Finish");

    }
}
