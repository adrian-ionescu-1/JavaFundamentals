package Arrays;

public class ForEachExemple {

    public static void main(String[] args) {

        int[] numbers = {5, -1, 10, 3};

        for ( int element : numbers ) {
            System.out.println(element);
        }

        System.out.println("_______________________");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
