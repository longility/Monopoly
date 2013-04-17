package monopoly;

public interface Space {
	void landOnAction(Player p);

	void passOverAction(Player p);
	
	String getName();
	
	void setNextSpace(Space next);
	
	Space getNextSpace();
}
