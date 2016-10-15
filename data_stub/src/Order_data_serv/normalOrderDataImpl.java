package Order_data_serv;

import java.util.ArrayList;

import PO.OrderPO;

public class normalOrderDataImpl {
	ArrayList<OrderPO> list=new ArrayList<OrderPO>();
	
	public OrderPO[] getOrderList(String id){
		ArrayList<OrderPO> l=new ArrayList<OrderPO>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(id)){
				l.add(list.get(i));
			}
		}
		OrderPO[] orders=(OrderPO[])l.toArray(new OrderPO[l.size()]);
		System.out.println("get success");
		return orders;
	}
	
	public OrderPO[] getOrderList() {
		OrderPO[] orders=(OrderPO[])list.toArray(new OrderPO[list.size()]);
		System.out.println("get success");
		return orders;
	}
	
}
