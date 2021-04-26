package Task2;

public class Main {

	public static void main(String[] args) {
		Category computer= new Category(1,"Bilgisayar");
		Category phone= new Category(2,"Telefon");
		Category printer= new Category(3,"Yazýcý");
				
		Product product1=new Product(1,"Lenovo ideapad",computer);
		Product product2=new Product(2,"Samsung s20",phone);
		Product product3=new Product(3,"Hp Laserjet",printer);
		
		Business.AddProducts(product1,product2,product3);
		
		Business.ListProducts();
	}

}
