package monopoly;

import java.util.*;

public class Board {
	private ArrayList<iSpace> boardList = new ArrayList<iSpace>();
	
	public Board(){
		for(int i = 0; i < 40; i++){
			if(i==0)
				boardList.add(new GoSpace(200));
			else if(i==38)
				boardList.add(new LuxuryTaxSpace(-75));
			else boardList.add(new NullSpace());
		}
	}
	
	public iSpace getSpace(int i){
		return boardList.get(i);
	}
	
}
