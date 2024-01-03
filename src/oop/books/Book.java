package oop.books;

public class Book {

    String title; // has default access modifier
    public String author; // has public access modifier
    private int numberOfPages; // has private access modifier

    public void setNumberOfPages(int numberOfPages) {
        if (isNumberOfPagesValid(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The number of pages is incorrect");
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesValid(int noOfPages) {
        return noOfPages > 0;
    }
}
