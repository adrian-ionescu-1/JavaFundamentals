package Variables;

public class VariableEx {

    static int globalVariable = 10; // Declararea si initializarea unei variabile globale

    public static void main(String[] args) {


        int passenger;  // Declararea variabilei locale
        passenger = 0; // Initializarea variabilei
        passenger = passenger + 5; // Actualizarea variabilei
        passenger = passenger - 2 + 3;
        passenger = passenger + 2;
        System.out.println(passenger); // Afisarea valorii din variabila

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println(stops);
        System.out.println(fare);

        int numberOfDayUntilNextSDAClass;
        int _number;
        int $number;

        final int MINUTES_IN_AN_HOUR = 60;
        int minutesInAnDay = 24 * MINUTES_IN_AN_HOUR;
        System.out.println(minutesInAnDay);
        System.out.println(MINUTES_IN_AN_HOUR * 24); // Ambele variante sunt corecte



    }
}
