package Arrays;

public class ArraysDeclarationAndInitialization {

    public static void main(String[] args) {

        String[] myStringArray = new String[5]; // declararea unui array cu elemente de tip String cu lungimea de 5 elemente
        myStringArray[0] = "SDA"; // initializarea valorii de pe pozitia 0 din array
        myStringArray[4] = "Curs";
        myStringArray[1] = "Adrian";

        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[0]);
        System.out.println("Elementul de pe pozitia 1 este " + myStringArray[1]);
        System.out.println("Elementul de pe pozitia 2 este " + myStringArray[2]);
        System.out.println("Elementul de pe pozitia 3 este " + myStringArray[3]);
        System.out.println("Elementul de pe pozitia 4 este " + myStringArray[4]);

        System.out.println(myStringArray[1].length());

        /* declararea si initializare a unui array cu 4 elemente
        cu tot cu initializarea fiecarei valori a fiecarui element din array*/
        String[] secondStringArray = new String[] {"SDA", "Adrian", "10", "Duminica"};

        System.out.println(secondStringArray[2]);

        int[]intArray = {5, -1, 2, 6}; // alta varianta de declarare si initializare a unui array si a valorilor sale
        intArray[2] = intArray[2] + 1;

        System.out.println(intArray[2]);

        if(myStringArray[2] != null) {
            System.out.println(myStringArray[2].toUpperCase());
        }

        System.out.println(intArray[intArray.length - 1]);

    }
}
