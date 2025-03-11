// Creating the RadiusOfCircle class to print radius using default and parametrized constructor
import java.util.Scanner;

public class RadiusOfCircle{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // Scanner class to find user's input

       System.out.print("Radius of circle: ");
       double radius = scanner.nextDouble();
       
       System.out.println("With default constructor: ");
       Radius defaultRadius = new Radius();  // Default constructor 
       defaultRadius.print();

       System.out.println("With parameterized constructor: ");
       Radius parameterizedRadius = new Radius(radius); // Parameterized constructor

       
       parameterizedRadius.print();
   }     
}


class Radius{
    //Fields(Attributes)
    private double radius;

   // Parameterized constructor
    public Radius(double radius){
       this.radius = radius;
   }

   // Default Constructor
   public Radius(){
       this(1.0);
   }

   // Printing the radius
   public void print(){
      System.out.println("Radius of circle is: " + radius);
      System.out.println();
}
}

// Input:
// Radius of circle: 4.5

// Output:
// With default constructor:
// Radius of circle is: 1.0

// With parameterized constructor:
// Radius of circle is: 4.5
