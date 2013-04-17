package monopoly;

import java.util.*;

public class Player extends Observable{
	private Space currentSpace;
	private int moneyAmt = 1500; 
	private int currentRoll = 0;
	private int netWorth = 1500;
	private String name;
	
	public Player(String s, Space startSpace, Observer o){
		name = s; 
		this.addObserver(o);
		currentSpace = startSpace;
	}
	
	private void playerChanged(){
		setChanged();
		notifyObservers();
	}
	
	private void roll(){
		Random numGen = new Random();
		currentRoll = numGen.nextInt(6) + 1 + 
					  numGen.nextInt(6) + 1;
	}
	
	private void move(int spacesToMove){	
		while(spacesToMove > 0){
			currentSpace = currentSpace.getNextSpace();
			if(spacesToMove == 1)
				currentSpace.landOnAction(this);
			else
				currentSpace.passOverAction(this);
			spacesToMove--;
		}
	}
	
	public Space getCurrentSpace(){
		return currentSpace;
	}
	
	public void creditMoney(int money) {
		moneyAmt += money;
		changeNetWorth();
	}
	
	public void debitMoney (int money) {
		moneyAmt -= money;
		changeNetWorth();
	}
	
	private void changeNetWorth(){
		netWorth = moneyAmt;
	}
	
	public void takeTurn(){
		roll();
		move(getRoll());
		playerChanged();
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
	
	public int getNetWorth(){
		return netWorth;
	}
	
	public String toString(){
		return name + " has rolled a " + getRoll() + " and is on " + currentSpace.getName();
	}
	
}
