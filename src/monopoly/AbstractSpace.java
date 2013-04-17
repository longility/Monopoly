package monopoly;

abstract class AbstractSpace implements Space {
	protected String spaceName;
	protected Space nextSpace;
	
	public AbstractSpace(String name, Space next){
		spaceName = name;
		nextSpace = next;
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
