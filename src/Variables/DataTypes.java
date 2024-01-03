package Variables;

public class DataTypes {

    public static void main(String[] args) { // Prescurtarea metodei cu main sau psvm

        byte byteNumber = 127; // Orice numere intre -128 si 127

        short shortNumber = (short) (byteNumber + 1); // cast de la byte la short

        int intNumber = 1;

        long longNumber = Integer.MAX_VALUE + 1; // 2147483647 +1

        int anotherIntNumber = (int) (longNumber + intNumber);

        System.out.println(anotherIntNumber); // Comanda rapida sout

        byte byteNumberTwo = (byte) (shortNumber + 10);
        System.out.println(byteNumberTwo);

        float floatNumber = 12.25F;
        double doubleNumber = 12.25;

        float anotherFloatNumber = 50.5f + floatNumber + (float) doubleNumber;

        boolean value = false;
        boolean anotherValue = value || true; // si && ; sau ||

        System.out.println(anotherValue);

        char firstCharacter = '%';
        char newLine = '\n';

        System.out.print(newLine);
        System.out.print(firstCharacter);

    }
}
