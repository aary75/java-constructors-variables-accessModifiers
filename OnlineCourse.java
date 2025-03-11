// Creating the OnlineCOurse class to display details of courses
import java.util.Scanner;

public class OnlineCourse{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       String space = "true";

       while(space.equals("true")){
          System.out.print("Enter Course Name: ");
          String courseName = scanner.nextLine();

          System.out.print("Duration of course(in days): ");
          int duration = scanner.nextInt();

          System.out.print("Fees of course: ");
          int fees = scanner.nextInt();
       
          // Creating object course1
          Course course1 = new Course(courseName, duration, fees);
          
         // displaying the detials
         course1.displayCourseDetails();
   
         scanner.nextLine();
         
         // Asking the user wants to change institute name or not
         System.out.print("Do you want to update institute name(true/false): ");
         String userChoice = scanner.nextLine();

         if(userChoice.equals("true")) Course.updateInstituteName(scanner);

        // Asking the user wants to add more courses or not
        System.out.print("Do you want to add more courses(true/false) ");
        space = scanner.nextLine();
        System.out.println();
    }
}
}

class Course{
    // Fields(attributes)
    private String courseName;
    private int duration;
    private int fees;
    private static String instituteName = "Chitkara University";

    // Constructor
    public Course(String courseName, int duration, int fees){
         this.courseName = courseName;
         this.duration = duration;
         this.fees = fees;
   }

   // update institute name
   public static void updateInstituteName(Scanner scanner){
         System.out.print("'New institute name is: ");
         instituteName = scanner.nextLine();
         System.out.println();
    }

   // display the course details
   public void displayCourseDetails(){
          System.out.println("Course Name: " + courseName);
          System.out.println("Duration: " + duration);
          System.out.println("Fees: " + fees);
          System.out.println("Institute Name: " + instituteName);
          System.out.println();
   }
    
}

// Input:
// Enter Course Name: HTML
// Duration of course(in days): 32
// Fees of course: 1000
// Course Name: HTML
// Duration: 32
// Fees: 1000
// Institute Name: Chitkara University

// Do you want to update institute name(true/false): true
// New institute name is: Pubjab University
// Do you want to add more courses(true/false) true

// Enter Course Name: CSS
// Duration of course(in days): 41
// Fees of course: 1500
// Course Name: CSS
// Duration: 41
// Fees: 1500
// Institute Name: Pubjab University

// Do you want to update institute name(true/false): false
// Do you want to add more courses(true/false) true

// Enter Course Name: Javascript
// Duration of course(in days): 32
// Fees of course: 3000
// Course Name: Javascript
// Duration: 32
// Fees: 3000
//Institute Name: Pubjab University

// Do you want to update institute name(true/false): false
// Do you want to add more courses(true/false) false
