package monopoly;

import java.util.*;

public class Player extends Observable{
	private int currentRoll = 0;
	private SpaceInterface currentSpace;
	private int moneyAmt = 1500; 
	private String name;
	
	public Player(String s, SpaceInterface startSpace, Observer o){
		name = s; 
		this.addObserver(o);
		currentSpace = startSpace;
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
	
	public void move(Board b){		
		for(int i = currentRoll; i > 0; i--)
			moveOneSpace(b,i);
	}
	
	public SpaceInterface getCurrentSpace() {
		return currentSpace;
	}

	public void moveOneSpace(Board b,int i){
		currentSpace = b.getNextSpace(currentSpace);
		if(i==1)
			currentSpace.landOnAction(this);
		else
			currentSpace.passOverAction(this);	
	}
	
	public void changeMoney(int m){
		moneyAmt += m;
	}
	
	public int getRoll(){
		return currentRoll;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMoney(){
		return moneyAmt;
	}
	
	public String toString(){
		return name + " has rolled a " + getRoll() + " and is on " + currentSpace.getName();
	}
	
}
