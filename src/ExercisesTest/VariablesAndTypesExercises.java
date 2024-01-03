package ExercisesTest;

public class VariablesAndTypesExercises {

    public static void main(String[] args) {

        // Question 3

        int bankBalance = 500;

        bankBalance = bankBalance + 250;

        bankBalance = bankBalance - 100;

        System.out.println("Resulting bank balance: " + bankBalance); // R = 650

        // Question 4

        System.out.println(2.0 * (5 / 2)); // R = 4.0

        // Question 5

        int day = 25;

        String month = "May";

        System.out.println("\nMy birthday is on " + month + " " + day + ".");

        // Question 6

        String firstName = "Adrian";
        String lastName = "Ionescu";
        String fullName = firstName + " " + lastName;

        int numberOfLetters = fullName.length();
        int numberOfLettersInFirstName = firstName.length();
        int numberOfLettersInLastName = lastName.length();

        System.out.println("\nHello, my name is " + fullName + ".");
        System.out.println("There are " + numberOfLetters + " letters in my full name.");
        System.out.println("My first name has " + numberOfLettersInFirstName + " letters.");
        System.out.println("My last name has " + numberOfLettersInLastName + " letters.");

        // Question 7

        double fahrenheit = 55.0;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("\nThe temperature in Celsius is: " + celsius + " degrees Celsius.");

    }
}
