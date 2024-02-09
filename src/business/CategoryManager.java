package business;

import java.util.List;

import dataAccess.CategoryDao;
import dataAccess.ProductDao;
import entities.Category;
import entities.Product;

public class CategoryManager {
	CategoryDao dao=new CategoryDao();
	public void add(Category category) {
		//business roles
		//iş kurallarından geçerse dao çalışır
		
		dao.add(category);
	}
	public List<Category> getAll(){
		return dao.getAll();
	}
}
