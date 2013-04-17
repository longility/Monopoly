package monopoly;

public class LuxuryTaxSpace extends AbstractSpace{
	private int taxAmount;

	public LuxuryTaxSpace(String name, Space next, int tax){
		super(name,next);
		taxAmount = tax;
	}
	
	@Override
	public void landOnAction(Player p){
		p.changeMoney(-taxAmount);
	}
}
