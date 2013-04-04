package monopoly;

public abstract class iSpace {
	
	abstract public void action(Player p);
	
	public void applyAction(Player p){
		checkPassGo(p);
		action(p);
	}
	
	public final void checkPassGo(Player p){
		if(p.getPassGo()){
			iSpace go = new GoSpace(200);
			go.action(p);
			p.resetPassGo();
		}
	}
}
