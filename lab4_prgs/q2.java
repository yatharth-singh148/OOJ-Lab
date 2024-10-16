import java.util.Scanner;
import java.util.*;
class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Number of Pages: " + numPages);
    }
    public String toString() {
        return "Book Details:\n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price + "\n" +
               "Number of Pages: " + numPages;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];

        // Creating book objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter number of pages: ");
            int numPages = sc.nextInt();
            scanner.nextLine();
            books[i] = new Book(name, author, price, numPages);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nDisplaying details using display method for book " + (i + 1) + ":");
            books[i].display();
            System.out.println("\nDisplaying details using toString method for book " + (i + 1) + ":");
            System.out.println(books[i].toString());
        }
        scanner.close();
    }
}
