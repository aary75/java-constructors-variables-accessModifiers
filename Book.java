// Creaint the Book class to print details of book using default and parameterized constructor
import java.util.Scanner;

public class Book{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       System.out.print("Enter title of book: ");
       String title = scanner.nextLine();  // title of book

       System.out.print("Name of author: ");
       String author = scanner.nextLine(); // author of book
     
       System.out.print("Price of book: ");
       int price = scanner.nextInt(); // price of book
       
       System.out.println("Printing details of book using default constructor");
       BookDetails book1 = new BookDetails();
       book1.print();

       System.out.println();

       System.out.println("Printing details of book using parameterized constructor");
       BookDetails book2 = new BookDetails(title, author, price);
       book2.print();

       // Closing the scanner class
       scanner.close();
   }
}


class BookDetails{
      
     // Fields(Atttributes)
     private String title;
     private String author;
     private int price;

     // Default Constructor
     public BookDetails(){
         this.title = "Default title";
         this.author = "Default author";
         this.price = 0;
    }

    // Parameterized constructor
    public BookDetails(String title, String author, int price){
            this.title = title;
            this.author = author;
            this.price = price;
    }

    // Printing the details of book
    public void print(){
         System.out.println("Title of this book is: "  + title);
         System.out.println("Author of this book is: " + author);
         System.out.println("Price of this book is: " + price);
    }
}


// Input:
// Enter title of book: NCERT History
// Name of author: NCERT
// Price of book: 250

// Output:
// Printing details of book using default constructor
// Title of this book is: Default title
// Author of this book is: Default author
// Price of this book is: 0

// Printing details of book using parameterized constructor
// Title of this book is: NCERT History
// Author of this book is: NCERT
// Price of this book is: 250
