package monopoly;

public class GoSpace extends AbstractSpace{
	private int goAmount;
	
	public GoSpace(String name, int goAmt){
		super(name);
		goAmount = goAmt; 
	}
	
	@Override
	public void landOnAction(Player p){
		p.changeMoney(goAmount);
	}
	
	@Override
	public void passOverAction(Player p){
		p.changeMoney(goAmount);
	}
}
