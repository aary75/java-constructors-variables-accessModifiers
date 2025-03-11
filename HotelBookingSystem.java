// Creating the GuestDetails class to print the details of guest
import java.util.Scanner;

public class HotelBookingSystem{
     public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); // Scanner class to get details of guest

        System.out.print("Enter guest's name: ");
        String guestName = scanner.nextLine();  // GuestName

        // Room type: Single, Double, Twin,Triple, Presidential, suite
        System.out.print("Enter room's type: ");
        String roomType = scanner.nextLine();  // Room type

        System.out.print("Enter nights you have to stay: ");
        int nights = scanner.nextInt(); // Number of nights he/she wants to stay

        System.out.println();
        System.out.print("Default Constructor");
        GuestDetails defaultConstructor = new GuestDetails();
        defaultConstructor.print();

       
        System.out.print("Parameterized Constructor");
        GuestDetails parameterizedConstructor = new GuestDetails(guestName, roomType, nights);
        parameterizedConstructor.print();

     
        System.out.print("Copy Constructor");
        GuestDetails copyConstructor = new GuestDetails(parameterizedConstructor);
        copyConstructor.print();

        // closing the scanner class
        scanner.close();
   }
}

class GuestDetails{
 
    // Fields(Attributes)
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public GuestDetails(){
        this.guestName = "Aaryan";
        this.roomType = "Presidential";
        this.nights = 7;
    }

    // Parameterized Constructor
    public GuestDetails(String guestName, String roomType, int nights){
          this.guestName = guestName;
          this.roomType = roomType;
          this.nights = nights;
   }

   // Default Constructor
   public GuestDetails(GuestDetails guest){
          this.guestName = guest.guestName;
          this.roomType = guest.roomType;
          this.nights = guest.nights;
  }

   // Printing the details of guest and hotel room
   public void print(){
       System.out.println();
       System.out.println("Name of guest: "+ guestName);
       System.out.println("Room's type: " + roomType);
       System.out.println("Nights he/she wants to stay: " + nights);
       System.out.println();
   }
}


// Input:
// Enter guest's name: Hitesh
// Enter room's type: Suite
// Enter nights you have to stay: 5

// Output:
// Default Constructor
// Name of guest: Aaryan
// Room's type: Presidential
// Nights he/she wants to stay: 7

// Parameterized Constructor
// Name of guest: Hitesh
// Room's type: Suite
// Nights he/she wants to stay: 5

// Copy Constructor
// Name of guest: Hitesh
// Room's type: Suite
// Nights he/she wants to stay: 5
