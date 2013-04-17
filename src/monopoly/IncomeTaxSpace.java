package monopoly;

public class IncomeTaxSpace extends AbstractSpace {
 	private int flatTax = 200;
 	private double percentTax = 0.1;
 	
	public IncomeTaxSpace(){
		super("Income Tax Space"); 
	}
	
	@Override
	public void landOnAction(Player p){
		int percentage = (int)(p.getNetWorth() * percentTax);
		System.out.println(percentage);
		if(percentage < flatTax)
			p.debitMoney(percentage);
		else
			p.debitMoney(flatTax);
	}
}
