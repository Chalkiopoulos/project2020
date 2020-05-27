package Project2020;

public class Pencil extends Item{
	private String type="";
	private double tipSize;
	
    public Pencil(String name, String description, int id,	int stock , double price,double tipSize,String type) {
    	super(name,description,id,stock,price);
    	while(type!="Ç"||type!="B"||type!="ÇB") {
    		
    		this.type=type;
    	}
    	
    	this.tipSize=tipSize;
    }
    public String getDetails() {
        System.out.print(this.type);
        System.out.print(this.tipSize);
        return "";
    }
}
