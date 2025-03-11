// Creating the LibrarySystem class to design the system of library
import java.util.Scanner;

public class LibrarySystem{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); // Scanner class to get user's input

         System.out.print("Enter title of book: ");
         String title = scanner.nextLine();

         System.out.print("Enter author of book: ");
         String author = scanner.nextLine();

         System.out.print("Price of book: ");
         int price = scanner.nextInt();

         // Checking the availability of books
         System.out.print("Availability of book: ");
         boolean isAvailable = scanner.nextBoolean();
         
         // Creating the book object 
         Books book1 = new Books(title, author, price, isAvailable);
         
         // Display the details
         book1.display();
          
         scanner.nextLine();

         // Aksing for borrow
         System.out.print("Do you want to borrow a book (yes/no): ");
         String response = scanner.nextLine().toLowerCase();

         if(response.equals("yes")){
               book1.isAvailable();
          }
         else{
           System.out.println("Maybe next time");
         }
         
         // Updated details
         System.out.println("Updated details: ");
         book1.display();

  }
}

class Books{

     // Fields (Attributes)
     private String title;
     private String author;
     private int price;
     private boolean isAvailable;

     // Creating constructor
     public Books(String title,String author,int price,boolean isAvailable){
           this.title = title;
           this.author = author;
           this.price = price;
           this.isAvailable = isAvailable;
    }

    // Checking the availability of book
    public void isAvailable(){
         if(isAvailable){
            isAvailable = false;
            System.out.println("You can borrow The book " + title);
         }
         else{
            System.out.println("Sorry this book is not available");
         }
       System.out.println();
    }

   // displaying the details
    public void display(){
          System.out.println("Title of book: " + title);
          System.out.println("Author of book: " + author);
          System.out.println("Price of book: " + price);
          System.out.println("Availablility: " + (isAvailable ? "Available" : "Not Available"));
          System.out.println();
    }
}

// Input:
// Enter title of book: NCERT History
// Enter author of book: NCERT
// Price of book: 250
// Availability of book: true

// Output:
// Title of book: NCERT History
// Author of book: NCERT
// Price of book: 250
// Availablility: Available

// Do you want to borrow a book (yes/no): yes
// You can borrow The book NCERT History

// Updated details:
// Title of book: NCERT History
// Author of book: NCERT
// Price of book: 250
// Availablility: Not Available
