package Project2020;

public class Notebook extends Item{
	private int NumSub; 
	
	
    public Notebook(String name, String description, int id,	int stock , double price,int NumSub) {
    	super(name,description,id,stock,price);
    	this.NumSub =NumSub;
    	
    }
    public String getDetails() {
        System.out.print(this.NumSub);
        
        return "";
    }
}
