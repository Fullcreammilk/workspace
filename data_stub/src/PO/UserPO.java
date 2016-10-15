package PO;

public class UserPO {
	private String id;
	private String password;
	
	public UserPO(String id,String password){
		super();
		this.id=id;
		this.password=password;
	}
	
	public String getID(){
		return id;
	}
	
	public void setPassword(String p){
		this.password=p;
	}
	
	public String getPassword(){
		return password;
	}
}
