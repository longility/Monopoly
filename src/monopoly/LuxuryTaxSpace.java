package monopoly;

public class LuxuryTaxSpace extends AbstractSpace{
	private int taxAmount = 75;

	public LuxuryTaxSpace(){
		super("Luxury Tax Space");
	}
	
	@Override
	public void landOnAction(SpacePlayerClient p){
		p.debitMoney(taxAmount);
	}
}
