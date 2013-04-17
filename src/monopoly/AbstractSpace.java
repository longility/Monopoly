package monopoly;

abstract class AbstractSpace implements Space {
	protected String spaceName;
	protected Space nextSpace;
	
	public AbstractSpace(String name){
		spaceName = name;
	}
	
	public void landOnAction(SpacePlayerClient p) {
		//Default implementation is to do nothing.
	}

	public void passOverAction(SpacePlayerClient p) {
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
