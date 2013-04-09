package monopoly;

public class LuxuryTaxSpace extends AbstractSpace{
	private int taxAmount;

	public LuxuryTaxSpace(String name, AbstractSpace next, int tax){
		super(name,next);
		taxAmount = tax;
	}
	
	public void landOnAction(Player p){
		p.changeMoney(taxAmount);
	}
	
	public void passOverAction(Player p){
		
	}
}
