package Task2;

import java.util.ArrayList;

public class Business {
	static ArrayList<Product> products= new ArrayList<Product>();
	public static void AddProduct(Product product) {
		products.add(product);
	}
	public static void AddProducts(Product... args) {
		for (Product product : args) {
			products.add(product);
		}
		
	}
	
	public static void ListProducts() {
		for (Product product : products) {
			System.out.println(product.ID+" | "+product.Name +" | "+product.category.Name);
		}
		
	}
	public static ArrayList<Product> GetAllProducts() {
		return products;
		
	}
	
}
