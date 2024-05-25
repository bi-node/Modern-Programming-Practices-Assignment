package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product {
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

	public Product(String title, Double price, int model) {
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
        Product[] products = new Product[10];
        
        // Initializing Product objects with provided values and adding them to the array
        products[0] = new Product("Smartwatch", 199.99, 2023);
        products[1] = new Product("Headphones", 79.99, 2022);
        products[2] = new Product("Tablet", 299.99, 2024);
        products[3] = new Product("Camera", 499.99, 2021);
        products[4] = new Product("Speaker", 149.99, 2023);
        products[5] = new Product("Gaming Console", 399.99, 2022);
        products[6] = new Product("Fitness Tracker", 129.99, 2024);
        products[7] = new Product("Laptop", 899.99, 2021);
        products[8] = new Product("Smart Home Hub", 249.99, 2023);
        products[9] = new Product("Drone", 699.99, 2022);
        
        
        
        List<Product> productlist=Arrays.asList(products);
        PriceComparator p1=new PriceComparator();
        Collections.sort(productlist, p1);
        System.out.println(productlist.toString());
        
        
        TitleComparator titleComparator=new TitleComparator();
        Collections.sort(productlist, titleComparator);
        System.out.println(productlist.toString());
        
		
	}


}
