package monopoly;

public class IncomeTaxSpace extends AbstractSpace {
 	private int flatTax = 0;
 	private double percentTax = 0;
 	
	public IncomeTaxSpace(String name, Space next, int tax, double percent){
		super(name,next); 
		flatTax = tax;
		percentTax = percent;
	}
	
	@Override
	public void landOnAction(Player p){
		int percentage = (int)(p.getNetWorth() * percentTax);
		System.out.println(percentage);
		if(percentage < flatTax)
			p.changeMoney(-percentage);
		else
			p.changeMoney(-flatTax);
	}
}
