package Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int number = 7;

        int anotherValue = number--; // anotherNumber = number dupa care se face number= number- 1

        System.out.println(anotherValue);
        System.out.println(number);

        int plusValue = ++number; // plusValue = (number = number + 1)

        System.out.println(plusValue);
        System.out.println(number);
    }
}
