package ExercisesTest;

public class LoopsExercises {

    public static void main(String[] args) {

        // Question 2

        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

        // Question 3

        String[] sentence = {"Learning", "Java", "is", "fun"};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);

        // Question 4

        double initialDeposit = 50000;
        int years = yearsTilOneMillion(initialDeposit);

        System.out.println("Years required to reach $1,000,000: " + years);

        // Question 5

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        printInReverse(weekdays);

        // Question 5

        int[] myIntArray = {1, 0, 2, 3, -1, 2};
        int resultA = findRange(myIntArray);

        if (resultA == -1) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("The range of the array is: " + resultA);
        }

        // Question 7

        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }


    }

    public static int indexOfFirstOccurrence(String[] stringArray, String target) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int yearsTilOneMillion(double initialBalance) {
        double targetAmount = 1000000;
        double interestRate = 0.05;
        int years = 0;

        while (initialBalance < targetAmount) {
            initialBalance *= (1 + interestRate);
            years++;
        }
        return years;
    }

    public static void printInReverse(String[] stringArray) {
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    public static int findRange(int[] intArray) {
        if (intArray.length == 0) {
            return -1;
        }

        int smallest = intArray[0];
        int largest = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
            if (intArray[i] > largest) {
                largest = intArray[i];
            }
        }
        return  largest - smallest;
    }

}
