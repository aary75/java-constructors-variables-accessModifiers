// Creating the class LibraryManagementSystem to manage library
import java.util.Scanner;

// LbraryManagementSystem class to run the program
public class LibraryManagementSystem {
     public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        String space = "true";

         while(space.equals("true")) {
          System.out.print("Enter ISBN: ");
          String isbn = scanner.nextLine();

          System.out.print("Enter book's title: ");
          String title = scanner.nextLine();

          System.out.print("Enter author's name: ");
          String authorName = scanner.nextLine();

          // Creating a Book object
          Book book1 = new Book(isbn, title, authorName);
        
          book1.display();
         
          // Updating Author's name
          System.out.print("Author's name change: ");
          String newAuthor = scanner.nextLine();
          book1.setAuthor(newAuthor);

         System.out.println("Updated author's name: " + book1.getAuthor());
          System.out.println();
          // Creating a EBook object
          EBook ebook = new EBook(isbn, title, authorName);
          
          ebook.displayebookInfo();

         System.out.print("Do you want to add more student(true/false): ");
         space = scanner.nextLine();
   }
}}

// Book class
class Book{

     public String isbn; // Public attribute
     protected String title; // Protected attribute
     private String authorName;  // Private attribute

     // Constructor
     public Book(String isbn, String title, String authorName){
         this.isbn = isbn;
         this.title = title;
         this.authorName = authorName;
    }

    // Getter method for author's name
    public String getAuthor(){
        return authorName;
    }

    // setter method for author's name
     public void setAuthor(String newAuthor) {
          
           this.authorName = newAuthor;
      }

      // Method to display book details
      public void display() {
         System.out.println();
         System.out.println("Author: " + authorName);
      }
}

// subclass demonstrating use of protected member
class EBook extends Book {
    
     // Constructor
     public EBook(String isbn, String title,String author){
        super(isbn, title,author);
        
     }

     // Method to display isbn and title 
     public void displayebookInfo(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println();
    }
}
 

// Input:
// Enter ISBN: ERKCL
// Enter book's title: NCERT History
// Enter author's name: Ncert

// Output:
// Author: Ncert
// Author's name change: Disha
// Updated author's name: Disha

// ISBN: ERKCL
//Title: NCERT History

// Do you want to add more student(true/false): true
// Input:
// Enter ISBN: RKNCE
// Enter book's title: NCERT Chemistry
// Enter author's name: NCERT

// Author: NCERT
// Author's name change: disha
// Updated author's name: disha

// ISBN: RKNCE
// Title: NCERT Chemistry

// Do you want to add more student(true/false): false
