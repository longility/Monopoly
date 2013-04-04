package monopoly;

public class LuxuryTax implements iSpace{

	int taxAmount;
	
	public LuxuryTax(int tax){
		taxAmount = tax;
	}
	
	public void applyAction(Player p){
		p.setMoney(taxAmount);
	}
	
}
