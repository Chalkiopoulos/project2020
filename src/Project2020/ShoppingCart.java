package Project2020;
import java.util.ArrayList;

public class ShoppingCart {
	ArrayList <ItemOrdered> orderList = new ArrayList <ItemOrdered>();
	
	
// ��� ������� �� � ��������� �������� ��� item�rdered ����� ������� �� ����� �� �� stock ��� ������������ 
	
	void addItemOrdered(ItemOrdered ordered) throws NotEnoughStockException,NegativeOrderException  
{
		boolean flag=false;
		int i=0;
try {
		for ( i=0; i<orderList.size(); i++ )  // ������ �� ������� ��� ���������� ����� ������������
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
			// ��� ������ �� ����������� ��� ���������� ������� ��� �� ���� ����������
			// �������� ��� �������� ��� ����������� ���� � ������� �� ���� ��� ���� �����������
			// ����.
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
			//���� �� �� ������� ��� ���� ����.
		}
		catch(NegativeOrderException e) { 
			//���� �� �� ������� ��� ���� ����.
		}
}
	
void removeitemordered(ArrayList<ItemOrdered> array, int i)//������� ���� ����� ��� ������ ���� ������� �����
														//�� i ����� ������� ��� ��� ���� ���� ����������
														//��� �� ARRAY LIST �� ���������!!!!!!!!!!!!!!!!!


	{
		// ��� ��������� ��� ���� ����������� � ������� ���� ��� stock ��� ������������ ��� ��������
		// ��� ���������� ��� �� shopping cart
		array.get(i).getItem().setstock(array.get(i).getItem().getstock()+array.get(i).getquantity());
		array.remove(i);
	}
	

}
