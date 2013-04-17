package monopoly;

public class LuxuryTaxSpace extends AbstractSpace{
	private int taxAmount;

	public LuxuryTaxSpace(String name, int tax){
		super(name);
		taxAmount = tax;
	}
	
	@Override
	public void landOnAction(Player p){
		p.changeMoney(-taxAmount);
	}
}
