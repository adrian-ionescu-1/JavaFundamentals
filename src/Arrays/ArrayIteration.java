package Arrays;

public class ArrayIteration {

    public static void main(String[] args) {

        int[] myIntArray = {5, -1, 0, 6, 10};

        // printarea fiecarui element din array in ordine crescatoare
        for(int i = 0; i <= myIntArray.length-1; i++) {
            System.out.println("Elementul de pe pozitia " + i + " este; " + myIntArray[i]);
        }

        // printarea fiecarui element din array in ordine descrescatoare
        for(int i = myIntArray.length-1; i >=0; i--) {
            System.out.println("Elementul de pe pozitia " + i + " este; " + myIntArray[i]);
        }

        String[] stringArray = {"sda", "azi", "Adrian", "Ionescu"};

        findHowManyCharactersAreInStringArray(stringArray);

        System.out.println("Media aritmetica a numerelor din array este: " + calculateAverageOf(myIntArray));
    }

    static int calculateAverageOf(int[] numbers) {
        int sum = 0;
        for(int i = 0; i <= numbers.length - 1; i++) {
           sum = sum + numbers[i];
        }
        return sum / numbers.length;
    }

    static void findHowManyCharactersAreInStringArray(String[] words) {
        int sumOfCharacters = 0;
        for(int i =  0; i <= words.length - 1; i++) {
            sumOfCharacters += words[i].length();
        }
        System.out.println("Numarul total de caractere din toate elementele la un loc este " + sumOfCharacters);
    }
}