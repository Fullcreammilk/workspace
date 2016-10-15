package Strategy_data_serv;

import java.util.ArrayList;

import PO.StrategyPO;

public class hotelStrategyDataImpl {
	ArrayList<StrategyPO> list=new ArrayList<StrategyPO>();
	
	public void insertStrategy(StrategyPO strategyPO){
		list.add(strategyPO);
		System.out.println("insert success");
	}
	
	public StrategyPO[] getStrategyList (){
		StrategyPO[] l=(StrategyPO[])list.toArray(new StrategyPO[list.size()]);
		System.out.println("get success");
		return l;
	}
	
	public void deleteStrategy(String id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(id)){
				list.remove(i);
				System.out.println("delete success");
			}
		}
	}
	
	public void modifiedStrategy(StrategyPO strategy){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(strategy.getName())){
				list.set(i, strategy);
				System.out.println("modify success");
			}
		}
	}
}
