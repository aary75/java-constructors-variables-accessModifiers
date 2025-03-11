// Creating the PersonDetails class to print details of a person
import java.util.Scanner;

public class PersonDetails{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Scanner class to get user's input
 
       // Details of person
       System.out.print("Enter person's name: ");
       String name = scanner.nextLine();

       System.out.print("Enter person's age: ");
       int age = scanner.nextInt();
       
       scanner.nextLine();
       System.out.print("Enter city living in: ");
       String city = scanner.nextLine();
       
       System.out.println();

       // Default constructor
       System.out.println("Default Constructor");
       Details defaultPerson = new Details(name, age, city);
       defaultPerson.print();
       
       System.out.println();

       // Copy constructor
       System.out.println("Copy Constructor");
       Details copyPerson = new Details(defaultPerson);
       copyPerson.print();
  }
}


class Details{
   
     // Fields(Attributes)
     private String name;
     private int age;
     private String city;

    // Default Constructor
     public Details(String name, int age, String city){
         this.name = name;
         this.age = age;
         this.city = city;
    }

    // Copy Constructor
    public Details(Details defaultPerson){
           this.name = defaultPerson.name;
           this.age = defaultPerson.age;
           this.city = defaultPerson.city;
    }

    // Printing the details of person
    public void print(){
         System.out.println("Name: "+ name);
         System.out.println("Age: " + age);
         System.out.println("City Living in: " + city);
    }
}

// Input:
// Enter person's name: Aaryan
// Enter person's age: 21
// Enter city living in: Kalayat

// Output:
// Default Constructor
// Name: Aaryan
// Age: 21
// City Living in: Kalayat

// Copy Constructor
// Name: Aaryan
// Age: 21
// City Living in: Kalayat
