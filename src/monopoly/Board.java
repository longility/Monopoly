package monopoly;

import java.util.*;

public class Board{
	private ArrayList<AbstractSpace> boardList = new ArrayList<AbstractSpace>();
	
	public Board(){
		for(int i = 0; i < 40; i++){
			// this is getting messy probably would want to use dependency injection
			AbstractSpace nextSpace;
			if(i==0)
				nextSpace = null;
			else 
				nextSpace = boardList.get(0);
			if(i==39)
				boardList.add(0, new GoSpace("Go Space",nextSpace,200));
			else if(i==2)
				boardList.add(0, new LuxuryTaxSpace("Luxury Tax Space",nextSpace,-75));
			else 
				boardList.add(0, new NullSpace("Null Space",nextSpace));
		}
		//make list circular 
		AbstractSpace lastSpace = boardList.get(boardList.size() - 1);
		AbstractSpace firstSpace = boardList.get(0);
		lastSpace.setNextSpace(firstSpace);
	}
	
	public AbstractSpace getSpace(int i){
		return boardList.get(i);
	}
	
	public int getIndex(AbstractSpace space){
		return boardList.indexOf(space);
	}
}
