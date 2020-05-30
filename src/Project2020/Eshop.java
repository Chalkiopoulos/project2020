package Project2020;

import java.util.Scanner;
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

public void addItem() throws ItemAlreadyExistsException
{
	boolean flag=false;
	int itemStock,itemID;
	String itemName,itemDescription;
	double itemPrice;
	int choice;
	Item item=null;
	
	
	Scanner myscan = new Scanner(System.in);
	
	
	System.out.println("Give the item's name:");
	itemName=myscan.nextLine();
	System.out.println("Give the item's description:");
	itemDescription=myscan.nextLine();
	System.out.println("Give the item's id:");
	itemID=myscan.nextInt();
	System.out.println("Give the item's price:");
	itemPrice=myscan.nextDouble();
	System.out.println("Give the item's starting stock:");
	itemStock=myscan.nextInt();
	
	for (int i=0; i<itemsList.size(); i++)
	{
		if (itemID==itemsList.get(i).getid())
		{
			throw new ItemAlreadyExistsException();
		}
	}
	
do
{	
	System.out.println("What type of item do you want to add?"+'\n'+"Press 1 for Pencil"+'\n'+"Press 2 for Pen"+'\n'+"Press 3 for notebook"+'\n'+"Press 4 for paper");
	choice=myscan.hashCode();
	switch(choice)
	{
	case 1:
		{
			double tipsize;
			String type;
			
			System.out.println("Give tipsize in mm ");
			tipsize=myscan.nextDouble();
			System.out.println("Give type of pencil(H,B,HB)");
			do 
				{
					type=myscan.nextLine();
					if(type!="H"&&type!="B"&&type!="HB")
						System.out.println("This is not a valid type give another type");
				}
			while(type!="H"&&type!="B"&&type!="HB");
			
			item=new Pencil(itemName,itemDescription,itemID,itemStock,itemPrice,tipsize,type);
			break;
		}
		
	case 2:
		{
			String color;
			double tipsize;
			
			System.out.println("Give tipsize in mm ");
			tipsize=myscan.nextDouble();
			System.out.println("Give color of pen");
			color=myscan.nextLine();
			
			item = new Pen (itemName,itemDescription,itemID,itemStock,itemPrice,color,tipsize);
			
			break;
		}
	case 3:
		{
			int numsub;
			
			System.out.println("Give the number of subsections ");
			numsub=myscan.nextInt();
			item=new Notebook(itemName,itemDescription,itemID,itemStock,itemPrice,numsub);
			break;
		}
		
	case 4:
		{
			int weight;
			int pages;
			
			System.out.println("Give the weight in grammars(must be an integer) ");
			weight=myscan.nextInt();
			System.out.println("Give the number of pages ");
			pages=myscan.nextInt();
			
			item=new Paper(itemName,itemDescription,itemID,itemStock,itemPrice,weight,pages);
			break;
		}
		
	default:
		{
			flag=true;
			System.out.println("You did not enter a valid choice, try again");
		}	
		
	}
}
	while (flag==true);
	
	itemsList.add(item);
	
	}

public Item getitembyid(int id) throws NoSuchIDFoundException
 {
	int index=0;
	boolean flag=false;
	
	if (itemsList.isEmpty())
	{
		return null;
	}
	
	for ( int i=0; i<itemsList.size(); i++ )
	   {
		if(id==itemsList.get(i).getid()) 
			{
			flag=true;
			index=i;
			break;
			}
	   }
	if (flag)
		{return  itemsList.get(index);}
	 
	else
	{
		throw new NoSuchIDFoundException();
	}
 }



}