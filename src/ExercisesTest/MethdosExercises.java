package ExercisesTest;

import java.util.Random;

public class MethdosExercises {

    public static void main(String[] args) {

        // Question 4

        double inputNumber = -3.88;
        double result = absoluteValue(inputNumber);
        System.out.println("The absolute value of " + inputNumber + " is " + result);

        // Question 5

        double mealCost = 50.0;
        double tip = calculateTip(mealCost);
        System.out.println("For a meal cost of $" + mealCost + ", the tip amount is $" + tip);

        // Question 6

        String name = "Adrian";
        String nametag = nametagText(name);
        System.out.println(nametag);

        // Question 7

        double temperatureInFahrenheit = 98.6;
        printTemperature(temperatureInFahrenheit);

        // Question 8

        int diceRollResult = monopolyRoll();
        System.out.println("Dice roll result: " + diceRollResult);
    }

    public static double absoluteValue(double number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

    public static double calculateTip(double costOfMeal) {
        double tipPercentage = 0.15;
        double tipAmount = costOfMeal * tipPercentage;
        return tipAmount;
    }

    public static String nametagText(String name) {
        String nametag = "Hello, my name is " + name;
        return nametag;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
        return celsiusTemperature;
    }

    public static void printTemperature(double fahrenheitTemperature) {
        double celsiusTemperature = fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println("F: " + fahrenheitTemperature + "°F");
        System.out.println("C: " + celsiusTemperature + "°C");
    }

    private static Random random = new Random();

    private static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static int monopolyRoll() {
        int firstRoll = generateRandomInt(1, 6);
        int secondRoll = generateRandomInt(1, 6);

        if (firstRoll != secondRoll) {
            return firstRoll + secondRoll;
        } else {
            int thirdRoll = generateRandomInt(1, 6);
            int fourthRoll = generateRandomInt(1, 6);
            return firstRoll + secondRoll + thirdRoll + fourthRoll;
        }

    }
}
