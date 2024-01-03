package Conditionals;

public class SwitchExemple {

    public static void main(String[] args) {

        String dayOfWeek = "Luni";
        switch (dayOfWeek) {
            case "Luni":
                System.out.println("Iarba nu creste");
                break;
            case "Sambata":
            case "Duminica":
                System.out.println("Este weekend!");
                break;
            default:
                System.out.println("Este mijlocul saptamanii");
        }
    }
}
