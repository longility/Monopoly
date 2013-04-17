package monopoly;

public class GoSpace extends AbstractSpace{
	private int goAmount;
	
	public GoSpace(String name, Space next, int goAmt){
		super(name,next);
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
