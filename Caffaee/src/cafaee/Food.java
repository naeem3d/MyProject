package cafaee;

import java.util.ArrayList;

public class Food {
    private String name;
    private double price;
   
    

    private String subWay;
    private double addition1Price;

   

    public Food(String name, String meat, double price, String breadRollType) {
        this.name = name;
       
        this.price = price;
      
    }

    public void addHamburgerAddition1(String name, double price) {
        this.subWay = name;
        this.addition1Price = price;
       
    }

    

    public double itemizeHamburger() {
    	 
         
        double hamburgerPrice = this.price;
        System.out.println( " You Order "  +  this.name +  ", price is "  +  "$" + this.price );
        if(this.subWay != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("You Order  " + this.subWay + " for an extra " + this.addition1Price);
        }
       
        System.out.println("\n========================== ");
        System.out.println("\nPress ");
        System.out.println("\t 0 - See Your Order .");
        System.out.println("\t 1 - View List .");
        System.out.println("\t 2 - Hamburger");
        System.out.println("\t 3 - Subway.");
        System.out.println("\t 4 - Pittza.");
        System.out.println("\t 5 - Tea dring.");
        System.out.println("\t 6 - Cofaee Dring.");
        System.out.println("\t 7 - Remove Item.");
        

        return hamburgerPrice;
    }

    

  





}
