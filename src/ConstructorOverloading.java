public class ConstructorOverloading {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");

        Book book2 = new Book("Atomic Habits", "James Clear", 19.99);

        book1.display();
        book2.display();
    }
}

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---------------------");
    }
}
