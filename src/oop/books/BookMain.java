package oop.books;

public class BookMain {

    public static void main(String[] args) {
        Book anotherBook = new Book();
        /*access the variable title can be used here becauses it has default access modifier
        and this class is in the same package as Book class
         */
        anotherBook.title = "Luceafarul";
    }
}
