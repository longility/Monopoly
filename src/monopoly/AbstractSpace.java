package monopoly;

abstract class AbstractSpace implements Space {
	protected String spaceName;
	protected Space nextSpace;
	
	public AbstractSpace(String name, Space next){
		spaceName = name;
		nextSpace = next;
	}
	
	public void landOnAction(Player p) {
		//Default implementation is to do nothing.
	}

	public void passOverAction(Player p) {
		//Default implementation is to do nothing.
	}
	
	public String getName(){
		return spaceName;
	}
	
	public void setNextSpace(Space next){
		nextSpace = next;
	}
	
	public Space getNextSpace(){
		return nextSpace;
	}
}
