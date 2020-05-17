package Project2020;

import java.util.ArrayList;

public class Eshop {
String name;
Owner owner;
ArrayList <Item> itemsList = new ArrayList <Item>();
ArrayList <Buyer> buyerList = new ArrayList <Buyer>();


public Eshop (Owner owner, String name)
	{
		this.name=name;
		this.owner= owner;
	}
public Item getitembyid(int id) throws NoSuchIDFoundException
	{
	int index;
	for ( int i=0; i<itemsList.size(); i++ )
	   {
		if(id==itemsList.get(i).getid()) 
			{
			index=i;
			 break;
			}
		else
		{
			throw new NoSuchIDFoundException(); //
		}
	   } 
	return itemsList.get(index);
	
	}
}
