// Creating the ProductInventory class to get total number of products
import java.util.Scanner;

public class ProductInventory{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner class to get usre's input

        String space = "true";

        // entering product details
        while(space.equals("true")){
            System.out.print("Enter Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter cost of product: ");
            int productPrice = scanner.nextInt();
   
            // Creating the objects
            Product productDetails = new Product(productName, productPrice);
            
            // Displaying the result
            productDetails.displayProductDetails();

            scanner.nextLine();

            System.out.print("You want to add more products (true/false): ");
            space = scanner.nextLine();

            System.out.println();
      }
        // Finding total number of products
        Product.displayTotalProducts();

       // closing the scanner class
       scanner.close();
    }
}

class Product{
      // Fields(Attributes)
      private String productName;
      private int productPrice;
      private static int totalProducts = 0;
  
      // Constructor
      public Product(String productName, int productPrice){
          this.productName = productName;
          this.productPrice = productPrice;
          totalProducts++;
     }

    // Displaying the total Products
    public static void displayTotalProducts(){
           System.out.print("Total products are: " + totalProducts);
    }

     // displaying the product details
     public void displayProductDetails(){
        
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: "+ productPrice);
     }
}

// Input:
// Enter Product name: Soap
// Enter cost of product: 20
// Product Name: Soap
// Product Price: 20
// You want to add more products (true/false): true

// Enter Product name: Oil
// Enter cost of product: 10
// Product Name: Oil
// Product Price: 10
// You want to add more products (true/false): true

// Enter Product name: Comb
// Enter cost of product: 20
// Product Name: Comb
// Product Price: 20
// You want to add more products (true/false): true

// Enter Product name: Scissors
// Enter cost of product: 30
// Product Name: Scissors
// Product Price: 30
// You want to add more products (true/false): false

// Output:
// Total products are: 4
