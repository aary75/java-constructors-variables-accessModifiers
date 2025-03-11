// Creating the VehicleRegistration class to display details of vehicles
import java.util.Scanner;

public class VehicleRegistration{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       String space = "true";

       while(space.equals("true")){
          System.out.print("Enter Owner Name: ");
          String ownerName = scanner.nextLine();

          System.out.print("Vehicle Type: ");
          String vehicleType = scanner.nextLine();
       
          // Creating object vehicle1
          Vehicle vehicle1 = new Vehicle(ownerName, vehicleType);
          
         // displaying the detials
         vehicle1.displayVehicleDetails();
   
//         scanner.nextLine();
         
         // Asking the user wants to update registration fees or not
         System.out.print("Do you want to update registration fee(true/false): ");
         String userChoice = scanner.nextLine();

         if(userChoice.equals("true")){
             Vehicle.updateRegistrationFee(scanner);
            scanner.nextLine();
         }
        // Asking the user wants to add more vehicles or not
        System.out.print("Do you want to add more vehicles(true/false) ");
        space = scanner.nextLine();
        System.out.println();
    }
     // closing the scanner class
     scanner.close();
}
}

class Vehicle{
    // Fields(attributes)
    private String ownerName;
    private String vehicleType;
    private static int registrationFee = 200;

    // Constructor
    public Vehicle(String ownerName,String vehicleType){
         this.ownerName = ownerName;
         this.vehicleType = vehicleType;
   }

   // update registration fees
   public static void updateRegistrationFee(Scanner scanner){
         System.out.print("'New registration fee is: ");
         registrationFee = scanner.nextInt();
         System.out.println();
    }

   // display the vehicle details
   public void displayVehicleDetails(){
          System.out.println("Owner Name: " + ownerName);
          System.out.println("Vehicle Type: " + vehicleType);
          System.out.println("Registration Fee: " + registrationFee);
          System.out.println();
   }
    
}

// Input:
// Enter Owner Name: Aaryan
// Vehicle Type: Creta
// Owner Name: Aaryan
// Vehicle Type: Creta
// Registration Fee: 200

// Do you want to update registration fee(true/false): false
// Do you want to add more vehicles(true/false) true

// Enter Owner Name: Hitesh
// Vehicle Type: Scorpio
// Owner Name: Hitesh
// Vehicle Type: Scorpio
// Registration Fee: 200

//Do you want to update registration fee(true/false): true
// Output: 'New registration fee is: 300

// Do you want to add more vehicles(true/false) true

// Enter Owner Name: Yash
// Vehicle Type: Nezen
// Owner Name: Yash
// Vehicle Type: Nezen
// Registration Fee: 300

// Do you want to update registration fee(true/false): false
// Do you want to add more vehicles(true/false) false

