package data_stub;

import java.util.ArrayList;

import PO.OrderPO;

public class Order_data_serv {
	ArrayList<OrderPO> list=new ArrayList<OrderPO>();
	
	public void insertOrder (OrderPO po){
		list.add(po);
		System.out.println("insert success");
	}
	
	public void modifiedOrder(OrderPO po){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(po.getID())){
				list.set(i, po);
				System.out.println("modify success");
			}
		}
	}
	
	public OrderPO getOrder(String OrderID){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(OrderID)){
				System.out.println("get success");
				return list.get(i);
			}
		}
		return null;
	}
}
