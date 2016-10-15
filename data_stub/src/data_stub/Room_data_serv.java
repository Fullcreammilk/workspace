package data_stub;

import java.util.ArrayList;

import PO.RoomPO;

public class Room_data_serv {
	ArrayList<RoomPO> list=new ArrayList<RoomPO>();
	
	public RoomPO getRoom(String hotelname,String type){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getHn().equals(hotelname)&&list.get(i).getType().equals(type)){
				System.out.println("get success");
				return list.get(i);
			}
		}
		return null;
	}
	
	public RoomPO[] getRoomList(String hotelname){
		ArrayList<RoomPO> l=new ArrayList<RoomPO>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getHn().equals(hotelname)){
				l.add(list.get(i));
			}
		}
		RoomPO[] rooms=(RoomPO[])l.toArray(new RoomPO[l.size()]);
		System.out.println("get success");
		return rooms;
	}
	
	public void insertRoom(RoomPO room){
		list.add(room);
		System.out.println("insert success");
	}
	
	public void deleteRoom(String hotelname,String type){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getHn().equals(hotelname)&&list.get(i).getType().equals(type)){
				list.remove(i);
				System.out.println("delete success");
			}
		}
	}
	
	public void modifiedRoom (RoomPO room){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getHn().equals(room.getHn())
					&&list.get(i).getType().equals(room.getType())){
				list.set(i, room);
				System.out.println("modify success");
			}
		}
	}
}
