package monopoly;

public class GoSpace implements SpaceInterface{
	private int goAmount;
	private String spaceName;
	
	public GoSpace(String name, int goAmt){
		goAmount = goAmt; 
		spaceName = name;
	}
	
	public void landOnAction(Player p){
		p.changeMoney(goAmount);
	}
	
	public void passOverAction(Player p){
		p.changeMoney(goAmount);
	}
	
	public String getName(){
		return spaceName;
	}
	
}
