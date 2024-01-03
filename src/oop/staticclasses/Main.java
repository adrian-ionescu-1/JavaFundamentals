package oop.staticclasses;

public class Main {
    public static void main(String[] args) {

        ExternalClass objectFromExternalClass = new ExternalClass();

        ExternalClass.InternalClass objectFromInternalClass = objectFromExternalClass.init();
        ExternalClass.InternalClass otherObjectFromInternalClass = new ExternalClass.InternalClass();
        objectFromInternalClass.print("Some text");
        otherObjectFromInternalClass.print("Another text");

        System.out.println(ExternalClass.number);
    }
}
