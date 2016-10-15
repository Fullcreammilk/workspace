package data_stub;

import java.util.ArrayList;

import PO.HotelPO;

public class Hotel_data_serv {
	private ArrayList<HotelPO> list=new ArrayList<HotelPO>();
	
	public void insertHotel(HotelPO hotel){
		list.add(hotel);
		System.out.println("insert success");
	}
	
	public HotelPO getHotel (String name){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)){
				System.out.println("get success");
				return list.get(i);
			}
		}
		return null;
	}
	
	public void deleteHotel (String name){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)){
				list.remove(i);
				System.out.println("delete success");
			}
		}
	}
	
	public void modifiedHotel (HotelPO hotel){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(hotel.getName())){
				list.set(i, hotel);
				System.out.println("modify success");
			}
		}
	}
	
	public HotelPO[] getHotelList (String businesscircle){
		ArrayList<HotelPO> l=new ArrayList<HotelPO>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getBC().equals(businesscircle)){
				l.add(list.get(i));
			}
		}
		HotelPO[] hotels=(HotelPO[])l.toArray(new HotelPO[l.size()]);
		System.out.println("get success");
		return hotels;
	}
}
