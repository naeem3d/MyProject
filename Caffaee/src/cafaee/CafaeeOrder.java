package cafaee;

import java.util.ArrayList;
import java.util.Scanner;
// add this text to be sure is update in my repository 
public class CafaeeOrder {
	private static ArrayList<Double> order = new ArrayList<>();
	private static ArrayList<String> orderNameList = new ArrayList<>();
public static void main(String[] args) {
	  List list = new List();
	 list.printGroceryList();
     
	@SuppressWarnings("resource")
	
	Scanner scanner = new Scanner(System.in);
	int choice2 = scanner.nextInt();
	
	boolean quit = false;
    int choice = 0; 

    
   
    while (!quit) {
        System.out.println("Enter your choice: , Press 1 to see the list  or Print 0 to see Your order  ");
        choice = scanner.nextInt();
       // scanner.nextLine();

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
	Food hamburger = new Food( "Burger", 4.0);
	System.out.println("You order Burger  4.0");
	order.add( hamburger.getPrice());
	orderNameList.add(hamburger.getName());
	printInstructions();
}

public static void subWayWithITaliBread() {
	Food Subway = new Food("Subway", 4.5);
	System.out.println("You order " + Subway.getName() + " " + Subway.getPrice());
	order.add( Subway.getPrice());
	orderNameList.add(Subway.getName());
	printInstructions();
	
}

public static void pittzza_food() {
	Food Pittzza = new Food("Pittzza", 3.5);
	  System.out.println("You order " + Pittzza.getName() + " " + Pittzza.getPrice() );
	order.add( Pittzza.getPrice());
	orderNameList.add(Pittzza.getName());
	printInstructions();
    
}

public static void teaDring() {
	Food Tea = new Food("Tea",  0.99);
     System.out.println("You order " + Tea.getName() + " " + Tea.getPrice());
    order.add( Tea.getPrice());
	orderNameList.add(Tea.getName());
	printInstructions();
}

public static void coffeeSmallSize() {
	Food Coffee = new Food("Coffee",  0.99);
    System.out.println("You order " + Coffee.getName() + " " + Coffee.getPrice());
    order.add( Coffee.getPrice());
	orderNameList.add(Coffee.getName());
	printInstructions();
}



public static void removeItem(int scanner) {
  
    order.remove(scanner);
    String theItem2 = orderNameList.get(scanner);
    orderNameList.remove(theItem2);
    }
}







