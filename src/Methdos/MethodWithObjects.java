package Methdos;

public class MethodWithObjects {

    public static void main(String[] args) {

        MethodWithObjects object = new MethodWithObjects();
        object.checkNumber(10);

        object.sumOf100Numbers();

    }

    void checkNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Numarul este par si nu il afisam");
            return;
        }
        System.out.println("Numarul este impar" + number);
    }

    void sumOf100Numbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Suma primelor 100 de munere este: " + sum);
    }

}
