package Variables;

public class StringEx {

    public static void main(String[] args) {

        String text = "This is a text";

        System.out.println(text);

        System.out.println(text.toUpperCase());

        text = text.toLowerCase();
        System.out.println(text);

        int lengthOfText = text.length();
        System.out.println("Lungime textului este: " + lengthOfText);

        System.out.println(text.concat(" ").concat("alt text"));

        System.out.println(text.indexOf("text"));

        String anotherText = "This is a text";

        System.out.println(text.equals(anotherText));
        System.out.println(text.equalsIgnoreCase(anotherText));

        System.out.println(anotherText.replaceAll(" ", ","));
        System.out.println(anotherText.contains("is"));

        System.out.println(text + "\n" + anotherText);

    }
}
