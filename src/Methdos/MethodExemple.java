package Methdos;

public class MethodExemple {

    public static void main(String[] args) {

        printName("Adrian"); // apelarea unei metode

        String myName = createFullName("Adrian", "Ionescu");
        System.out.println("Numele meu este " + myName);

        System.out.println("Numele meu este " + createFullName("Adrian", "Ionescu"));

        System.out.println("Suma numerelor este " + calculateSum(5, 7));


    }

    // declararea unei metodei
    static void printName(String name) {
        System.out.println(name);
    }

    static String createFullName(String prenume, String name) {
        String fullName = name.concat(" ").concat(prenume);
        return fullName;
    }

    static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
}
