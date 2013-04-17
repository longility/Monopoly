package monopoly;

public class GoSpace extends AbstractSpace{
	private int goAmount = 200;
	
	public GoSpace(){
		super("Go Space"); 
	}
	
	@Override
	public void landOnAction(SpacePlayerClient p){
		p.creditMoney(goAmount);
	}
	
	@Override
	public void passOverAction(SpacePlayerClient p){
		p.creditMoney(goAmount);
	}
}
