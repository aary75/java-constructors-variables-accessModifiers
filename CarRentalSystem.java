// Creating a class CarRental to calculate total rent for given number of days
import java.util.Scanner;

public class CarRentalSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       System.out.print("Enter customer name: ");
       String cusName = scanner.nextLine();

       System.out.print("Enter car model: ");
       String carModel = scanner.nextLine();
 
       System.out.print("Days for you want to rent: " );
       int rentalDays = scanner.nextInt();

       int rent = 500; // fixed rent
        
       scanner.nextLine();

       // Creating the car object
       CarRental car1 = new CarRental(cusName, carModel, rentalDays);

       // Asking the customer that he/she want to rent a car or not
       System.out.print("Do you want to rent a car (yes/no)");
       String userChoice = scanner.nextLine().toLowerCase();

       if(userChoice.equals("yes")) car1.calTotalCost(rent);
       else System.out.println("May be next time");

       // Close the scanner class
       scanner.close();
    }
}

class CarRental{
     
     // Fields(Attributes)
     private String cusName;
     private String carModel;
     private int rentalDays;
     private int totalCost;

    // Constructon
     public CarRental(String cusName, String carModel, int rentalDays){
          this.cusName = cusName;
          this.carModel = carModel;
          this.rentalDays = rentalDays;
     }

     // Calculating the total cost for given rental days
     public void calTotalCost(int rent){
         totalCost = rent * rentalDays;
         System.out.println("The totla cost for days " + rentalDays +" on rent " + rent + " per day is " + totalCost);
     }

    // Printing the detials
    public void details(){
        System.out.println();
        System.out.println("Customer Name: " + cusName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
   }
}

// Input:
// Enter customer name: Aaryan
// Enter car model: Creta
// Days for you want to rent: 4
// Do you want to rent a car (yes/no)yes

// Output:
// The totla cost for days 4 on rent 500 per day is 2000
