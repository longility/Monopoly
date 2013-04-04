package monopoly;

public class LuxuryTaxSpace extends iSpace{

	int taxAmount;
	
	public LuxuryTaxSpace(int tax){
		taxAmount = tax;
	}
	
	public void action(Player p){
		p.setMoney(taxAmount);
	}
	
}
