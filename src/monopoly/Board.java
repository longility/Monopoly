package monopoly;

import java.util.*;

public class Board{
	private ArrayList<Space> spaces = new ArrayList<Space>();
	Space nextSpace;
	public Board(){
		createSpaces();
		linkSpaces();
	}
	
	public Space getStartingSpace() {
		return spaces.get(0);
	}
	
	private void createSpaces() {
		spaces.add(new GoSpace());
		spaces.add(createNullSpace());
		spaces.add(new IncomeTaxSpace());
		for(int i=3; i<38; i++)
			spaces.add(createNullSpace());
		spaces.add(0, new LuxuryTaxSpace());
		spaces.add(createNullSpace());
	}
	
	private Space createNullSpace() {
		return new NullSpace();
	}
	
	private void linkSpaces() {
		Space previousSpace = spaces.get(spaces.size()-1);
		for (Space space : spaces) {
			previousSpace.setNextSpace(space);
			previousSpace = space;
		}
	}
}
