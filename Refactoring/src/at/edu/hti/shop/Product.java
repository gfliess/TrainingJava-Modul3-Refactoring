package at.edu.hti.shop;

/**
 * @author Gerhard Fliess
 * 
 */
public class Product {
	private double price_;
	private String name_;
	private String id_;

	public Product(String id_, String name_) {
		super();
		this.id_ = id_;
		this.name_ = name_;
	}

	public double getPrice() {
		return price_;
	}

	public void setPrice(double price) {
		price_ = price;
	}

	public String getId() {
		return id_;
	}

	public String getName() {
		return name_;
	}

	public double getPrize() {
		return price_;
	}

	public String toString() {
		return id_ + " " + name_ + "," + price_;
	}
}
