package monopoly;

import java.util.*;

public class Board{
	private ArrayList<Space> boardList = new ArrayList<Space>();
	Space nextSpace;
	public Board(){
		for(int i = 0; i < 40; i++){
			if(i==0)
				nextSpace = null;
			else
				nextSpace = boardList.get(0);

			if(i==39)
				boardList.add(0, new GoSpace("Go Space",nextSpace,200));
			else if(i==36)
				boardList.add(0,new IncomeTaxSpace("Income Tax Space",nextSpace,200,.1));
			else if(i==2)
				boardList.add(0, new LuxuryTaxSpace("Luxury Tax Space",nextSpace,75));
			else 
				boardList.add(0, new NullSpace("Null Space",nextSpace));
		}
		//make list circular 
		Space lastSpace = boardList.get(boardList.size() - 1);
		Space firstSpace = boardList.get(0);
		lastSpace.setNextSpace(firstSpace);
	}
	
	public Space getStartingSpace() {
		return boardList.get(0);
	}
}
