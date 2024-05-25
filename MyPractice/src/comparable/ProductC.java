package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductC {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public ProductC(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s :%s", title, price, model);
	}
	public static void main(String[] args) {
		 // Creating an array of Product objects
        ProductC[] products = new ProductC[10];
        
        // Initializing Product objects with provided values and adding them to the array
        products[0] = new ProductC("Smartwatch", 199.99, 2023);
        products[1] = new ProductC("Headphones", 79.99, 2022);
        products[2] = new ProductC("Tablet", 299.99, 2024);
        products[3] = new ProductC("Camera", 499.99, 2021);
        products[4] = new ProductC("Speaker", 149.99, 2023);
        products[5] = new ProductC("Gaming Console", 399.99, 2022);
        products[6] = new ProductC("Fitness Tracker", 129.99, 2024);
        products[7] = new ProductC("Laptop", 899.99, 2021);
        products[8] = new ProductC("Smart Home Hub", 249.99, 2023);
        products[9] = new ProductC("Drone", 699.99, 2022);
        
        
        
        List<ProductC> productlist=Arrays.asList(products);
        //using lamdas
        Comparator<ProductC> productlamda=(p1,p2)->{
        	
        	if(p1.getPrice()>p2.getPrice())
    			return 1;
    		else if(p1.getPrice()<p2.getPrice())
    			return -1;
    		else {
    			return 0;
    		}
        };
        
       Collections.sort(productlist,productlamda);
       System.out.println(productlist.toString());
       
       //using anonymous class pre java 8
       Comparator<ProductC> productComparator=new Comparator<ProductC>() {
		
		@Override
		public int compare(ProductC o1, ProductC o2) {
			if(o1.getTitle().compareTo(o2.getTitle())<0) return -1;
			else if(o1.getTitle().compareTo(o2.getTitle())>0) return 1;
			else return 0;
			
		}
	};
	
	Collections.sort(productlist,productComparator);
    System.out.println(productlist.toString());
		
	}


}
