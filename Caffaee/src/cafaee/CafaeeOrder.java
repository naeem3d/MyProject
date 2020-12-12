package cafaee;

import java.util.ArrayList;
import java.util.Scanner;

public class CafaeeOrder {
	private static ArrayList<Double> order = new ArrayList<>();
	private static ArrayList<String> orderNameList = new ArrayList<>();
public static void main(String[] args) {
	  List list = new List();
	 list.printGroceryList();
     
     
	
   
	Scanner scanner = new Scanner(System.in);
	int choice2 = scanner.nextInt();
	Food hamburger2 = new Food(null, null, 0, null);
 
	double price = hamburger2.itemizeHamburger();
  
    
    boolean quit = false;
    int choice = 0;

    
    printInstructions();
    while (!quit) {
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 0:
                printInstructions();
                break;
            case 1:
               list.printGroceryList();
                break;
            case 2:
                Burger();
                break;
            case 3:
                subWayWithITaliBread();
                break;
            case 4:
                pittzza_food();
                break;
            case 5:
                teaDring();
                break;
            case 6:
                coffeeSmallSize();
                break;
            case 7:   
            	removeItem(choice2);
                break;
            case 8:
                quit = true;
                break;
        }
    }
}

public static void printInstructions() {
	 System.out.println("You have " + order.size() + " items in your order list");
	 double Total = 0;
     for(int i=0; i< order.size(); i++) {
         System.out.println((i+1) + ". " + orderNameList.get(i) + " " + "$"+ order.get(i));
         
         Total = Total + order.get(i);
     }
     System.out.println("TotalPrice is : " + Total);
}
public static void Burger() {
	Food hamburger = new Food( "Burger", "", 4.0, "");
	
	order.add( 4.0);
	orderNameList.add("Burger"); 
    double price = hamburger.itemizeHamburger();
}

public static void subWayWithITaliBread() {
	Food hamburger = new Food("Subway", " ", 4.5, "Itali");
	order.add(  4.5);
	orderNameList.add("Subway");
	double price = hamburger.itemizeHamburger();
}

public static void pittzza_food() {
	Food hamburger = new Food("Pittzza", "", 3.56, "");
	order.add( 3.56);
	orderNameList.add("Pittzza");
	
    double price = hamburger.itemizeHamburger();
}

public static void teaDring() {
	Food hamburger = new Food("Tea", "", 0.99, "black");
    double price = hamburger.itemizeHamburger();
    order.add(  0.99);
    orderNameList.add("Tea");
}

public static void coffeeSmallSize() {
	Food hamburger = new Food("Coffee", "", 0.99, "black");
    double price = hamburger.itemizeHamburger();
    order.add(  0.99);
    orderNameList.add("Tea");
}



public static void removeItem(int scanner) {
  
    order.remove(scanner);
    String theItem2 = orderNameList.get(scanner);
    orderNameList.remove(theItem2);
    }
}







