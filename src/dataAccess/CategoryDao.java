package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Product;

public class CategoryDao {
	private List<Category> categories;
	public CategoryDao() {
		categories=new ArrayList<Category>();
		categories.add(new Category(1,"meyve "));
		categories.add(new Category(2,"sebze"));
		categories.add(new Category(3,"elektronik"));
		
	}
	public void add(Category category) {
		categories.add(category);	
	}
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categories;
	}
	
}
