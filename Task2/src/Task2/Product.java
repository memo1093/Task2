package Task2;

public class Product {
	public Product() {
		System.out.println("Ürün eklendi");
	}
	public Product(int id,String name,Category category1) {
		this.ID=id;
		this.Name=name;
		this.category=category1;
	}
	public Product(int id,String name,int categoryId,String categoryName) {
		this.ID=id;
		this.Name=name;
		this.category.ID=categoryId;
		this.category.Name=categoryName;
	}
	
	int ID;
	String Name;
	Category category;
}
