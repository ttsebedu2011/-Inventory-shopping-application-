/**Thando Tsebedu
 * R00221555*/

package project;

enum Make{
	Apple,
	Samsung,
	Nokia;
	}


public class Phone extends Product{
	private Make make;
	private String model;
	private String storage;
		
	
	Phone(ProductDB productDB, String name, String description, double price, Make make, String model, String storage) {
		super(name, description, price);
		this.make = make;
		this.model = model;
		this.storage = storage;
		productDB.add(this);
	}
	
	public void setMake(Make make) {
		this.make = make;
	}
	
	public Make getMake() {
		return this.make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	public String getStorage() {
		return this.storage;
	}
	
	public void setName(String name) {
		super.name = name;
	}
	
	public String getName() {
		return super.name;
	}
	
	@Override
	public String print() {
		
		return "\nProductID: " + super.getProductID() + "\nName: " + this.getName() 
		+ "\nDescription: " + super.getDescription() + "\nPrice: €" + super.getPrice() 
		+ "\nMake: " + this.getMake() + "\nModel: " + this.getModel() + "\nStorage: " + this.getStorage();
		
	} 
	

}
