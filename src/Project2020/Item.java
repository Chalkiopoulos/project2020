package Project2020;

public abstract class Item {
	private String name,description;
	private int id,stock;
	private double price;

	public Item (String name, String description, int id,	int stock , double price) {
		this.name=name;
		this.description=description;
		this.id=id;
		this.stock=stock;
		this.price=price;
	}
	
	public String getBasicInfo() {
		return ( "Product's name : "+ name + '\n' + "Product's id : " + id +'\n' +"Product's stock : "+ stock + '\n' + "Product's price : "+ price +'\n' + "Description : "+ description);
	}
	
	public abstract String getDetails();
	
	public String tooString() {
	 return ( getBasicInfo() + getDetails() );
 }
// Μέθοδοι getters :
	public int getstock() {
		return this.stock;
	}
	public double getprice() {
		return ( this.price);
	}
// Μέθοδοι setters :	
	public int setstock(int newstock) {
		return this.stock= newstock;
	}
	public double setprice(double newprice) {
		return this.price= newprice;
	}
	public String setDescription (String newDescription) {
		return this.description=newDescription;
	}
	public boolean isthesame(Item a)
	{
		if (a.name==this.name&&a.id==this.id)
		return true;
		else return false;
	}
	
	
}
