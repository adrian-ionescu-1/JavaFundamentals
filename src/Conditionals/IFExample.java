package Conditionals;

public class IFExample {

    public static void main(String[] args) {

        float temperature = 38.5f;

        boolean hasFever = temperature >= 36.6f;

        if (hasFever) {
            System.out.println("Ai febra");
        }

        System.out.println("Finalul programului");
    }
}
