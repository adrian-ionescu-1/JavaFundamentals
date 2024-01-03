package Homework.Topic1;

public class Main {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Corolla", 2022, 25000, true, new Engine("Gasoline", 150));
        Car car2 = new Car("Honda", "Civic", 2022, 23000, true, new Engine("Gasoline", 140));

        // Display Car details
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();

        // Check equality between Car objects
        boolean areCarsEqual = car1.equals(car2);
        System.out.println("\nCar 1 is equal to Car 2: " + areCarsEqual);

        // Create TV objects
        Display display1 = new Display(55, "LED");
        Display display2 = new Display(65, "OLED");
        TV tv1 = new TV("Samsung", 55, true, 3840, 2160, display1);
        TV tv2 = new TV("LG", 65, true, 3840, 2160, display2);
        TV tv3 = new TV("Sony", 50, false, 1920, 1080, display1);

        // Display TV details
        System.out.println("\nTV 1 Details:");
        tv1.displayDetails();

        System.out.println("\nTV 2 Details:");
        tv2.displayDetails();

        System.out.println("\nTV 3 Details:");
        tv3.displayDetails();

        // Check equality between TV objects
        boolean areTVsEqual = tv1.equals(tv2);
        System.out.println("\nTV 1 is equal to TV 2: " + areTVsEqual);

        boolean areTVsEqual1And3 = tv1.equals(tv3);
        System.out.println("TV 1 is equal to TV 3: " + areTVsEqual1And3);

        // Create ShoppingCart objects
        Item item1 = new Item("Laptop", 1000);
        Item item2 = new Item("Phone", 500);
        ShoppingCart cart1 = new ShoppingCart(5);
        ShoppingCart cart2 = new ShoppingCart(3);

        cart1.addItem(item1);
        cart1.addItem(item2);
        cart2.addItem(item2);

        // Display ShoppingCart details
        System.out.println("\nShopping Cart 1 Items:");
        cart1.displayItems();

        System.out.println("\nShopping Cart 2 Items:");
        cart2.displayItems();

        // Check equality between ShoppingCart objects
        boolean areCartsEqual = cart1.equals(cart2);
        System.out.println("\nShopping Cart 1 is equal to Shopping Cart 2: " + areCartsEqual);

        // Create Student objects
        Course course1 = new Course("Math", 3);
        Course course2 = new Course("History", 4);
        Student student1 = new Student("John", 20, course1, "123456", 85.5);
        Student student2 = new Student("Jane", 22, course2, "789012", 92.0);

        // Display Student details
        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        // Check equality between Student objects
        boolean areStudentsEqual = student1.equals(student2);
        System.out.println("\nStudent 1 is equal to Student 2: " + areStudentsEqual);
    }
}
