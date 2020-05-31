package Project2020;

class Buyer extends User {
	private int bonus=0;
	private String buyerCategory="BRONZE";
	private ShoppingCart shoppingCart;
	
	public Buyer(String name ,String email){
		super(name , email);
		shoppingCart= new ShoppingCart();		
		}
	public void awardBonus(double price)
	{
		this.bonus=(int)price/10;
		this.setbuyerCategory();
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
	
	public int getbonus()
	{
		return this.bonus;
	}
	
	public String getBuyerCategory()
	{
		return this.buyerCategory;
	}
	
	public void placeOrder(Item item,int quantity) // ���� ��� �������� ��� ����� ������������ ��� ��������
	{
		ItemOrdered ordered= new ItemOrdered(item,quantity);
	 try {
		this.shoppingCart.addItemOrdered(ordered);
	    }
	 catch(NotEnoughStockException e){
			//���� �� �� ������� ��� ���� ����.
		}
		catch(NegativeOrderException e) { 
			//���� �� �� ������� ��� ���� ����.
		}
	 }
	public void placeOrder(Item item) // ���� ��� ������ ��� �� ����� ��� ������������� 
	{								  //��� ������� ��� ����������� 1 ���� ������� ��� ������
		ItemOrdered ordered= new ItemOrdered(item);
	 try {
		this.shoppingCart.addItemOrdered(ordered);
	    }
	 catch(NotEnoughStockException e){
			//���� �� �� ������� ��� ���� ����.
		}
		catch(NegativeOrderException e) { 
			//���� �� �� ������� ��� ���� ����.
		}
	 }
	
	
}
