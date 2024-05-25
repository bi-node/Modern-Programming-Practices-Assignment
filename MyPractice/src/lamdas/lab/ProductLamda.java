package lamdas.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductLamda {
	enum Type{
		TITLE, PRICE;
	}
	public static void main(String[] args) {
		 // Creating an array of Product objects
       Product[] products = new Product[10];
       
       // Initializing Product objects with provided values and adding them to the array
       products[0] = new Product("Smartwatch", 199.99, 2023);
       products[1] = new Product("Headphones", 79.99, 2022);
       products[2] = new Product("Tablet", 299.99, 2024);
       products[3] = new Product("Camera", 499.99, 2021);
       products[4] = new Product("Speaker", 149.99, 2023);
       products[5] = new Product("Gaming Console", 399.99, 2022);
       
       List<Product> productList=Arrays.asList(products);
       
       sortingComparator(productList, Type.TITLE);
       System.out.println(productList);
       
       
       
             
       
		
	}
	
	public static void sortingComparator(List<Product> productlist, Type t) {
	    if (t == Type.TITLE) {
	        Collections.sort(productlist, (p1, p2) -> {
	            if (p1 == null || p2 == null) {
	                return 0; // handle null values gracefully
	            }
	            return p1.getTitle().compareTo(p2.getTitle());
	        });
	    } else if (t == Type.PRICE) {
	        Collections.sort(productlist, (p1, p2) -> {
	            if (p1 == null || p2 == null) {
	                return 0; // handle null values gracefully
	            }
	            return Double.compare(p1.getPrice(), p2.getPrice());
	        });
	    }
	}

}
