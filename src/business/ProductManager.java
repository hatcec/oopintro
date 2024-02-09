package business;

import java.util.List;

import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
	ProductDao dao=new ProductDao();
	public void add(Product product) {
		//business roles
		//iş kurallarından geçerse dao çalışır
		
		dao.add(product);
	}
	public List<Product> getAll(){
		return dao.getAll();
	}
}
