package monopoly;

public class GoSpace implements SpaceInterface{
	private int goAmount;
	
	public GoSpace(int goAmt){
		goAmount = goAmt; 
	}
	
	public void landOnAction(Player p){
		
	}
	
	public void passOverAction(Player p){
		p.changeMoney(goAmount);
	}
	
}
