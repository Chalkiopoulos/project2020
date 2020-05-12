package Project2020;

class Buyer extends User {
	private int bonus=0;
	private String buyerCategory="BRONZE";
	
	
	public Buyer(String name ,String email){
		super(name , email);
				
		}
	
	public void setbuyerCategory()
	{
		if (this.bonus < 100)
			{this.buyerCategory="BRONZE";}
		else if ((this.bonus>=100) && (this.bonus<200))
			{this.buyerCategory="SILVER";}
		else
			{this.buyerCategory="GOLD";}
		
	}
	
}
