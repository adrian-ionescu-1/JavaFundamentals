package Arrays;

public class StringArray2D {

    public static void main(String[] args) {

        String[][] myStringArray = {{ "math", "english", "info"}, { "Ion", "Maria"}, {"ala", "bala", "porto", "cala"}};

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length; j++) {
                System.out.print(myStringArray[i][j] + " ");
            }
            System.out.println();
        }

        printLastLetterFromEachElementOfArray(myStringArray);

    }

    static void printLastLetterFromEachElementOfArray(String[][] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j].charAt(words[i][j].length()-1) + " ");
            }
            System.out.println();
        }

    }
}
