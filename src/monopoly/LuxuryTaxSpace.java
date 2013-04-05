package monopoly;

public class LuxuryTaxSpace implements SpaceInterface{

	int taxAmount;
	
	public LuxuryTaxSpace(int tax){
		taxAmount = tax;
	}
	
	public void landOnAction(Player p){
		p.changeMoney(taxAmount);
	}
	
	public void passOverAction(Player p){
		
	}
	
}
