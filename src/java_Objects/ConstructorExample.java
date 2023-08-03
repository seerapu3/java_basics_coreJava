package java_Objects;
class Book {
    String title;
    String author;

    // Constructor to initialize title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an object of the Book class using the constructor
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Displaying book information using the displayInfo() method
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}
