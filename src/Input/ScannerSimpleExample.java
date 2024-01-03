package Input;

import java.util.Scanner;

public class ScannerSimpleExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu de la tastatura un text");
        String inputFromUser = scan.nextLine(); // se citeste textul introdus de utilizator si se afiseaza valoarea introdusa
        System.out.println(inputFromUser.toUpperCase());

        System.out.println("Te rog introdu un numar intreg");
        byte byteNumberFromUser = scan.nextByte();

        System.out.println("Te rog un numar intreg");
        int intNumberFromUser = scan.nextInt();
        System.out.println(intNumberFromUser + byteNumberFromUser);

        System.out.println("Te rog introdu un numar cu virgula");
        double doubleNumberFromUser = scan.nextDouble();
        System.out.printf("%.2f\n", doubleNumberFromUser);

        // exemple of printed for formated text
        System.out.printf("Numele meu este %s si prenumele este %s", "Ionescu", "Adrian");
        
    }
}
