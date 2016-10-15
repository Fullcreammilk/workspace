package data_stub;

import java.util.ArrayList;

import PO.CreditPO;

public class Credit_data_serv {
	ArrayList<CreditPO> list=new ArrayList<CreditPO>();
	
	public double getTotel(String id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(id)){
				System.out .println("get success");
				return list.get(i).getTotel();
			}
		}
		return (Double) null;
	}
	
	public CreditPO getDetial(String id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(id)){
				System.out.println("get success");
				return list.get(i);
			}
		}
		return null;
	}
	
	public void insertCredit(CreditPO credit){
		list.add(credit);
		System.out.println("insert success");
	}
}
