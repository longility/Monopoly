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
		move();
	}
	
	private void move(){
		position += currentRoll;
		position %= 40;
	}
	
	public void setMoney(int m){
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
