package monopoly;

public class GoSpace extends AbstractSpace{
	private int goAmount = 200;
	
	public GoSpace(){
		super("Go Space"); 
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
