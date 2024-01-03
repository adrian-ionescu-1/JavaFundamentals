package ExercisesTest.personMethod;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", 3);
        person.addRelationship("Mother");
        person.addRelationship("Friend");
        person.addRelationship("Colleague");

        person.displayInformation();
    }
}
