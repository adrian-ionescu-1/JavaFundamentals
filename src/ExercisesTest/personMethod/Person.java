package ExercisesTest.personMethod;

public class Person {
    private String name;
    private String[] relationships;
    private int relationshipCount;

    public Person(String name, int maxRelationships) {
        this.name = name;
        this.relationships = new String[maxRelationships];
        this.relationshipCount = 0;
    }

    public void addRelationship(String relationship) {
        if (relationshipCount < relationships.length) {
            relationships[relationshipCount] = relationship;
            relationshipCount++;
        }
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.print("Relationships: ");
        for (int i = 0; i < relationshipCount; i++) {
            System.out.print(relationships[i]);
            if (i < relationshipCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
