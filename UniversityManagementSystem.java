// Creating the class UniversityManagementSystem to display student details
import java.util.Scanner;

// UniversityManagementSystem class to run the program
public class UniversityManagementSystem {
     public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        String space = "true";

         while(space.equals("true")) {
          System.out.print("Enter student's roll number: ");
          int rollNumber = scanner.nextInt();

          scanner.nextLine();
          System.out.print("Enter student's name: ");
          String name = scanner.nextLine();

          System.out.print("Enter student's CGPA: ");
          double cgpa = scanner.nextDouble();

          // Creating a student object
          Student student1 = new Student(rollNumber, name, cgpa);
        
          student1.display();
         
          // Updating CGPA
          System.out.print("CGPA we wanted: ");
          double newCGPA = scanner.nextDouble();
          student1.setCGPA(newCGPA);

         System.out.println("Updated CGPA: " + student1.getCGPA());
         
         scanner.nextLine();
         System.out.print("Research Topic: "); 
         String researchTopic = scanner.nextLine();

          // Creating a Postgraduate object
          PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name,cgpa, researchTopic);
          
          pgStudent.displayPostgraduateInfo();

         System.out.print("Do you want to add more student(true/false): ");
         space = scanner.nextLine();
   }
}}

// Student class
class Student{

     public int rollNumber; // Public attribute
     protected String name; // Protected attribute
     private double CGPA;  // Private attribute

     // Constructor
     public Student(int rollNumber, String name, double CGPA){
         this.rollNumber = rollNumber;
         this.name = name;
         this.CGPA = CGPA;
    }

    // Getter method for CGPA
    public double getCGPA(){
        return CGPA;
    }

    // setter method for CGPA
     public void setCGPA(double newCGPA) {
          if(newCGPA >= 0.0 && newCGPA <= 4.0) {
              this.CGPA = newCGPA;
          }
          else{
             System.out.println("Invalid CGPA");
          }
      }

      // Method to display student details
      public void display() {
         System.out.println("Roll Number: " + rollNumber);
         System.out.println("Name: " + name);
         System.out.println("CGPA: " + CGPA);
      }
}

// subclass demonstrating use of protected member
class PostgraduateStudent extends Student {
     private String researchTopic;

     // Constructor
     public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic){
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
     }

     // Method to display postgraduate student details
     public void displayPostgraduateInfo(){
        System.out.println("Postgraduate Student - name: " + name);
        System.out.println("Research Topic: " + researchTopic);
    }
}
 

// Input:
// Enter student's roll number: 101
// Enter student's name: Aaryan
// Enter student's CGPA: 3.7
// Roll Number: 101

// Output:
// Name: Aaryan
// CGPA: 3.7
// CGPA we wanted: 2.5
// Updated CGPA: 2.5
// Research Topic: Artificial Intelligence
// Postgraduate Student - name: Aaryan
// Research Topic: Artificial Intelligence
// Do you want to add more student(true/false): true

// Input:
// Enter student's roll number: 102
// Enter student's name: Hitesh
// Enter student's CGPA: 2.0
// Roll Number: 102
// Name: Hitesh
// CGPA: 2.0
// CGPA we wanted: 3.0
// Updated CGPA: 3.0
// Research Topic: BCA
// Postgraduate Student - name: Hitesh
// Research Topic: BCA
// Do you want to add more student(true/false): false
