package monopoly;

public class LuxuryTaxSpace implements SpaceInterface{
	private int taxAmount;
	private String spaceName;
	
	public LuxuryTaxSpace(String name, int tax){
		taxAmount = tax;
		spaceName = name;
	}
	
	public void landOnAction(Player p){
		p.changeMoney(taxAmount);
	}
	
	public void passOverAction(Player p){
		
	}
	
	
	public String getName(){
		return spaceName;
	}
}
