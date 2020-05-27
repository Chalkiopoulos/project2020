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
}

