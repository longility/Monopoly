package monopoly;

import java.util.*;

public class Board {
	private ArrayList<SpaceInterface> boardList = new ArrayList<SpaceInterface>();
	
	public Board(){
		for(int i = 0; i < 40; i++){
			if(i==0)
				boardList.add(new GoSpace("Go Space",200));
			else if(i==38)
				boardList.add(new LuxuryTaxSpace("Luxury Tax Space",-75));
			else 
				boardList.add(new NullSpace("Null Space"));
		}
	}
	
	public SpaceInterface getSpace(int i){
		return boardList.get(i);
	}
	
	public int getIndex(SpaceInterface space){
		return boardList.indexOf(space);
	}
	
	public SpaceInterface getNextSpace(SpaceInterface space){
		int nextIndex = boardList.indexOf(space) + 1;
		
		if(nextIndex >=40)
			nextIndex %= 40;
		
		return boardList.get(nextIndex);	
	}

	
}
