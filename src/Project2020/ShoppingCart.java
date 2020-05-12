package Project2020;
import java.util.ArrayList;

public class ShoppingCart {
	ArrayList <ItemOrdered> orderList = new ArrayList <ItemOrdered>();
	
	
// Εδώ τσεκάρω αν η αιτούμενη ποσότητα του itemΟrdered είναι επαρκής σε σχέση με το stock του αντικειμένου 
	
	void addItemOrdered(ItemOrdered ordered) throws NotEnoughStockException,NegativeOrderException  
{
		boolean flag=false;
		int i=0;
try {
		for ( i=0; i<orderList.size(); i++ )  // ελεγχω αν υπάρχει ηδη παραγγελια ιδιου αντικειμένου
				{
				if(orderList.get(i).getItem().isthesame(ordered.getItem()))
				{
				flag=true;
				break;
				}
			}
		if(ordered.getquantity()<0)
		{
			throw new NegativeOrderException();
		}
		else if (flag)
		{
			// Εδω επειδή το αντικείμενο που παραγγέλνω υπάρχει ήδη σε άλλη παραγγελία
			// προσθετω την ποσότητα που παραγγέλνει τώρα ο χρήστης με αυτή που είχε παραγγείλει
			// πριν.
			orderList.get(i).setquantity(orderList.get(i).getquantity()+ordered.getquantity());
		}
		else if ((ordered.getquantity())> ((ordered.getItem()).getstock()))
		{
			throw new NotEnoughStockException(); 
		}
		else
		{ 
			ordered.getItem().setstock((ordered.getItem()).getstock()-ordered.getquantity());
			orderList.add(ordered);
		}
		
	}
		
		catch(NotEnoughStockException e){
			//Θέλω να με γυρναει ένα βήμα πίσω.
		}
		catch(NegativeOrderException e) { 
			//Θέλω να με γυρναει ένα βήμα πίσω.
		}
}
	
void removeitemordered(ArrayList<ItemOrdered> array, int i)//ΠΡΟΣΟΧΗ ΠΡΟΣ ΣΦΗΚΑ ΚΑΙ ΟΠΟΙΟΝ ΑΛΛΟ ΦΤΙΑΞΕΙ ΜΕΝΟΥ
														//ΤΟ i ΕΙΝΑΙ ΔΕΙΚΤΗΣ ΠΟΥ ΜΑΣ ΛΕΕΙ ΠΟΙΑ ΠΑΡΑΓΓΕΛΙΑ
														//ΑΠΟ ΤΟ ARRAY LIST ΘΑ ΔΙΑΓΡΑΦΕΙ!!!!!!!!!!!!!!!!!


	{
		// εδω επιστρέφω ότι ειχε παραγγείλει ο χρηστης πισω στο stock του αντικειμένου και διαγραφω
		// την παραγγελία απο το shopping cart
		array.get(i).getItem().setstock(array.get(i).getItem().getstock()+array.get(i).getquantity());
		array.remove(i);
	}
	

}
