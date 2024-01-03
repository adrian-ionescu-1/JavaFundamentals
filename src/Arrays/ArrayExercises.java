package Arrays;

public class ArrayExercises {

    public static void main(String[] args) {

       ArrayExercises object = new ArrayExercises();
       String[] arrayOfString = {"Maria", "Bonc", "Card", "Teleenciclopedie", "scurt"};
        System.out.println(object.findTheLongesText(arrayOfString));

    }

    String findTheLongesText(String[] arrayOfText) {
        String longestText = arrayOfText[0];
        for (String myText : arrayOfText) {
            if (longestText.length() < myText.length()) {
                longestText = myText;
            }
        }
        return longestText;
    }
}
