/**Thando Tsebedu
 * R00221555*/

package project;

enum Type{
	LED,
	LCD;
}

public class TV extends Product{
	
	private String make;
	private String model;
	private Type type;

	TV(ProductDB productDB, String name, String description, double price, String make, String model, Type type) {
		super(name, description, price);
		productDB.add(this);
		this.make = make;
		this.model = model;
		this.type = type;
		
	}
	
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public void setName(String name) {
		super.name = name;
	}
	
	public String getName() {
		return super.name;
	}
	
	@Override
	public String print() {
		return  "\nProductID: " + super.getProductID()  + "\nName: " + this.getName() 
		+ "\nDescription: " + super.getDescription() + "\nPrice: "+ super.getPrice() + " "
		 + "\nMake: " + this.getMake() + "\nModel: " + this.getModel() + "\nType: " + this.getType();
		
	} 
	

}
