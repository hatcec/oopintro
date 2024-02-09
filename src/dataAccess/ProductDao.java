package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductDao {
	private List<Product> products;
	public ProductDao() {
		products=new ArrayList<Product>();
		products.add(new Product(1,"elma",25,10));
		products.add(new Product(2,"armut",35,10));
		products.add(new Product(3,"kiraz",55,10));
		products.add(new Product(4,"muz",45,10));
		products.add(new Product(5,"tuzlu fıstık",45,10));
		products.add(new Product(6,"patates",45,10));
	}
	public void add(Product product) {
	products.add(product);	
	}
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return products;
	}
	

}
