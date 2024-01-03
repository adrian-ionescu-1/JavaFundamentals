package ExercisesTest;

public class CaesarCipherDecoder {

    public static void main(String[] args) {
        String encodedMessage = "htsihj rjsy!";
        int rotation = 5;

        String decodedMessage = decodeCaesarCipher(encodedMessage, rotation);
        System.out.println("Decoded Message: " + decodedMessage);
    }

    public static String decodeCaesarCipher(String encodedMessage, int rotation) {
        char[] encodedChars = encodedMessage.toCharArray();
        StringBuilder decodedMessage = new StringBuilder();

        for (char c : encodedChars) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char decodedChar = (char) (((c - base - rotation + 26) % 26) + base);
                decodedMessage.append(decodedChar);
            } else {
                decodedMessage.append(c);
            }
        }

        return decodedMessage.toString();
    }
}
