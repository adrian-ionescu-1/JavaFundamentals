package oop;

import oop.staticmethod.MyPrinter;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(PI);

        MyPrinter.printNumber(10); // apelarea unei metode statice din clasa MyPrinter
        System.out.println("------------------------------------");
        System.out.println(MyPrinter.formatTime(5375));
    }
}
