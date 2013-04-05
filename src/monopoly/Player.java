package monopoly;

import java.util.*;

public class Player extends Observable{
	private int currentRoll = 0;
	private int position = 0;
	private int moneyAmt = 1500; 
	private String name;
	
	public Player(String s, Observer o){
		name = s; 
		this.addObserver(o);
	}
	
	public void playerChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void roll(){
		Random numGen = new Random();
		currentRoll = numGen.nextInt(6) + 1;
		currentRoll += numGen.nextInt(6) + 1;
	}
	
	public ArrayList<Integer> move(){
		ArrayList<Integer> passedSpaces = new ArrayList<Integer>();
		for(int i = 0; i < getRoll(); i++){
			moveOneSpace();
			passedSpaces.add(position);
		}
		return passedSpaces;
	}
	
	public void moveOneSpace(){
		position += 1;
		if(position == 40){
			position = 0;
		}
	}
	
	public void changeMoney(int m){
		moneyAmt += m;
	}
	
	public int getRoll(){
		return currentRoll;
	}
	
	public int getPosition(){
		return position;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMoney(){
		return moneyAmt;
	}
	
	public String toString(){
		return name + " has rolled a " + getRoll() + " and is on space # " + getPosition();
	}
	
}
