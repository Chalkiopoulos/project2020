package Project2020;

public class Paper extends Item{
	private int weight; 
	private int pages;
	
    public Paper(String name, String description, int id,	int stock , double price,int weight,int pages) {
    	super(name,description,id,stock,price);
    	this.weight =weight;
    	this.pages=pages;
    }
    public String getDetails() {
        System.out.print(this.weight);
        System.out.print(this.pages);
        return "";
    }
}
