package monopoly;

import java.util.*;

public class PlayerDisplay implements Observer{
	Observable observable;
	private int roll; 
	private SpaceInterface space;
	private int moneyAmt;
	private String name; 
	
	public void update(Observable o, Object arg){
		if(o instanceof Player){
			Player player = (Player) o;
			this.roll = player.getRoll();
			this.space = player.getCurrentSpace();
			this.name = player.getName();
			this.moneyAmt = player.getMoney();
			display();
		}
	}
	
	public void display(){
		System.out.println(name + " has rolled a " + roll + " and is on " + space.getName() + " and has the balance " + moneyAmt);
	}
}
