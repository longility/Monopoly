package monopoly;

public class GoSpace extends iSpace{
	private int goAmount;
	
	public GoSpace(int goAmt){
		goAmount = goAmt; 
	}
	
	public void action(Player p){
		p.setMoney(goAmount);
	}
}
