// Creating the class EmployeeRecord to manage employee records
import java.util.Scanner;

// EmployeeRecods class to run the program
public class EmployeeRecods {
     public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        String space = "true";

         while(space.equals("true")) {
          System.out.print("Enter employee's Id: ");
          int employeeId = scanner.nextInt();

          scanner.nextLine();
          System.out.print("Enter department: ");
          String department = scanner.nextLine();

          System.out.print("Enter salary: ");
          int salary = scanner.nextInt();

          // Creating a Employee object
          Employee employee1 = new Employee(employeeId, department, salary);
         
          // Updating salary
           scanner.nextLine();
          System.out.print("How balance change? By ");
          String salaryChange = scanner.nextLine();

          
          System.out.print("Amount change: ");
          int amount = scanner.nextInt();
          employee1.setSalary(salaryChange.toLowerCase(),amount);

         System.out.println("Updated salary: " + employee1.getsalary());
          System.out.println();

          // Creating a Manager object
          Manager manage = new Manager(employeeId, department, salary);
          
          manage.displayDepartmentInfo();
         scanner.nextLine();

         System.out.print("Do you want to add more employee(true/false): ");
         space = scanner.nextLine();
   }
}}

// BankAccount class
class Employee{

     public int employeeId; // Public attribute
     protected String department; // Protected attribute
     private int salary;  // Private attribute

     // Constructor
     public Employee(int employeeId, String department, int salary){
         this.employeeId = employeeId;
         this.department = department;
         this.salary = salary;
    }

    // Getter method for salary
    public int getsalary(){
        return salary;
    }

    // setter method for salary
     public void setSalary(String salaryChange, int amount) {
          
         if(salaryChange.equals("increment")){
              this.salary = salary + amount;
          }
          else{
               if(amount > salary) System.out.print("Cannot deduct");
               else this.salary = salary - amount;
           }
      }

}

// subclass Manager use of protected member
class Manager extends Employee {
    
     // Constructor
     public Manager(int employeeId, String department,int salary){
        super(employeeId, department, salary);
        
     }

     // Method to display employeeId and department
     public void displayDepartmentInfo(){
        System.out.println("Employee's ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
 
// Input:
// Enter employee's Id: 12
// Enter department: Organise
// Enter salary: 20000
// How balance change? By increment
//Amount change: 2000

// Output:
// Updated salary: 22000

// Employee's ID: 12
// Department: Organise

//Do you want to add more employee(true/false): true
// Input:
// Enter employee's Id: 13
// Enter department: Discipline
// Enter salary: 18000
// How balance change? By decrement
// Amount change: 2000

// Output:
// Updated salary: 16000

// Employee's ID 13
// Department: Discipline

// Do you want to add more employee(true/false): false
