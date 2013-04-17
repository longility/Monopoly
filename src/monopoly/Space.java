package monopoly;

public interface Space {
	void landOnAction(SpacePlayerClient p);

	void passOverAction(SpacePlayerClient p);
	
	String getName();
	
	void setNextSpace(Space next);
	
	Space getNextSpace();
}
