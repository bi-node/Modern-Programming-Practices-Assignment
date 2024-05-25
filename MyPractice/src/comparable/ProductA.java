package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductA implements Comparable<ProductA> {
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

	public ProductA(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s :%s", title, price, model);
	}
	public static void main(String[] args) {
		 // Creating an array of ProductA objects
        ProductA[] ProductAs = new ProductA[10];
        
        // Initializing ProductA objects with provided values and adding them to the array
        ProductAs[0] = new ProductA("Smartwatch", 199.99, 2023);
        ProductAs[1] = new ProductA("Headphones", 79.99, 2022);
        ProductAs[2] = new ProductA("Tablet", 299.99, 2024);
        ProductAs[3] = new ProductA("Camera", 499.99, 2021);
        ProductAs[4] = new ProductA("Speaker", 149.99, 2023);
        ProductAs[5] = new ProductA("Gaming Console", 399.99, 2022);
        ProductAs[6] = new ProductA("Fitness Tracker", 129.99, 2024);
        ProductAs[7] = new ProductA("Laptop", 899.99, 2021);
        ProductAs[8] = new ProductA("Smart Home Hub", 249.99, 2023);
        ProductAs[9] = new ProductA("Drone", 699.99, 2022);
        
        
        
        List<ProductA> ProductAlist=Arrays.asList(ProductAs);
        
		
		Collections.sort(ProductAlist);
		System.out.println(ProductAlist.toString());
        
	}

	@Override
	public int compareTo(ProductA o) {
		// TODO Auto-generated method stub
		return Double.compare(this.price, o.price);
	}


}
