package entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private double discountRate;
	private double discountedPrice;
	private Category category;
	
	
	//method overloading
	
	public Product() {
	
	}
	
	public Product(int id, String name, double unitPrice, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		double discountedPrice=this.unitPrice-(this.unitPrice*this.discountRate/100);
		this.discountedPrice = discountedPrice;
		return this.discountedPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
	
}
