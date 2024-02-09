package entities;

import business.CategoryManager;
import business.ProductManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryManager categoryManager=new CategoryManager();
		Product product1=new Product();
		product1.setId(1);
		product1.setName("laptop");
		product1.setUnitPrice(20000.00);
		product1.setDiscountRate(10);
		Product p2=new Product();
		p2.getName();
		
		
		Product product2=new Product();
		
		//System.out.println(product1.getName()+" "+ product1.getDiscountedPrice());
		
		ProductManager manager=new ProductManager();
		manager.add(product1);
		
		for(Product product:manager.getAll() ) {
			System.out.println(product.getName());
		}
		System.out.println("------------------------");
		Category category1=new Category();
		category1.setId(4);
		category1.setName("kuruyemiş");
		
		categoryManager.add(category1);
		for(Category category:categoryManager.getAll()) {
			System.out.println(category.getName());
		}
		
		

	}

}
