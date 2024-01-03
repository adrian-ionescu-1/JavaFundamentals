package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        Pattern pattern1 = Pattern.compile("alo+"); // alo, aloo, alooo, alooooo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Te rog introdu un text care sa fie verificat daca indeplineste sau nu patternul");
        Matcher matcher = pattern1.matcher(scanner.nextLine());
        System.out.println(matcher.matches());

        Pattern pattern2 = Pattern.compile("[a-zA-Z]*");
        System.out.println("Introdu litere mici");
        Matcher matcher2 = pattern2.matcher(scanner.nextLine());
        System.out.println("Textul introdus verifica pattenul: " + matcher2.matches());
        scanner.close();
    }
}
