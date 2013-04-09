package monopoly;

abstract class AbstractSpace {
	protected String spaceName;
	protected AbstractSpace nextSpace;
	
	public AbstractSpace(String name, AbstractSpace next){
		spaceName = name;
		nextSpace = next;
	}
	
	abstract void landOnAction(Player p);

	abstract void passOverAction(Player p);
	
	public String getName(){
		return spaceName;
	}
	
	public void setNextSpace(AbstractSpace next){
		nextSpace = next;
	}
	
	public AbstractSpace getNextSpace(){
		return nextSpace;
	}
}
