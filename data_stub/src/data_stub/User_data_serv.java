package data_stub;

import java.util.ArrayList;

import PO.UserPO;

public class User_data_serv {
	private ArrayList<UserPO> list=new ArrayList<UserPO>();
	
	public void insertUser(UserPO user){
		list.add(user);
		System.out.println("insert success");
	}
	
	public UserPO getUser(String id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(id)){
				System.out.println("get success");
				return list.get(i);
			}
		}
		return null;
	}
	
	public void deleteUser (String id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(id)){
				System.out.println("delete success");
				list.remove(i);
			}
		}
	}
	
	public void modifiedUser (UserPO user){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(user.getID())){
				list.set(i, user);
				System.out.println("modify success");
			}
		}
	}
	
	public UserPO[] getUserList (){
		UserPO[] users=(UserPO[])list.toArray(new UserPO[list.size()]);
		System.out.println("get success");
		return users;
	}
}
