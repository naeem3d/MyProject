package cafaee;

import java.util.ArrayList;

public class Food {
    private String name;
    private double price;
   
    
    public Food() {
    	
    }

    public Food(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double itemizeHamburger() {
    	 
        double hamburgerPrice = this.price;
        System.out.println( " You Order "  +  this.name +  ", price is "  +  "$" + this.price );
       
        return hamburgerPrice;
    }

    

  





}
