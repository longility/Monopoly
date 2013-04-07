package monopoly;

public class NullSpace implements SpaceInterface {
	private String spaceName;
	
	public NullSpace(String name){
		spaceName = name;
	}
	
	public void landOnAction(Player p){
		
	}
	
	public void passOverAction(Player p){
		
	}
	
	public String getName(){
		return spaceName;
	}
}
