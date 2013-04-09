package monopoly;

import java.util.*;

public class Player extends Observable{
	private int currentRoll = 0;
	private AbstractSpace currentSpace;
	private int moneyAmt = 1500; 
	private String name;
	
	public Player(String s, AbstractSpace startSpace, Observer o){
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
	
	public void move(){		
		for(int i = currentRoll; i > 0; i--)
			moveOneSpace(i);
	}
	
	public AbstractSpace getCurrentSpace() {
		return currentSpace;
	}

	public void moveOneSpace(int i){
		currentSpace = currentSpace.getNextSpace();
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
