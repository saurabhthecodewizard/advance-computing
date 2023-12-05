package stackscll;

public class Vehicle {
	private int no;
	private String company;
	private String model;
	private String type;
	private double price;
	private String colour;
	public Vehicle() {
		super();
	}
	public Vehicle(int no, String company, String model, String type, double price, String colour) {
		super();
		this.no = no;
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.colour = colour;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehicle [no=" + no + ", company=" + company + ", model=" + model + ", type=" + type + ", price=" + price
				+ ", colour=" + colour + "]";
	}
}
