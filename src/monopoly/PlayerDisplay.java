package monopoly;

import java.util.*;

public class PlayerDisplay implements Observer{
	Observable observable;
	private int roll; 
	private String spaceName;
	private int moneyAmt;
	private String name; 
	
	public void update(Observable o, Object arg){
		if(o instanceof ReadOnlyPlayerClient){
			ReadOnlyPlayerClient player = (ReadOnlyPlayerClient) o;
			this.roll = player.getRoll();
			this.spaceName = player.getCurrentSpaceName();
			this.name = player.getName();
			this.moneyAmt = player.getMoney();
			display();
		}
	}
	
	public void display(){
		System.out.println(name + " has rolled a " + roll + " and is on " + spaceName + " and has the balance " + moneyAmt);
	}
}
