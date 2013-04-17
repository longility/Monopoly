package monopoly;
import java.util.*;

public class MonopolyGame {
	ArrayList<Player> players = new ArrayList<Player>(); 
	Board board = new Board(); 
	PlayerDisplay display = new PlayerDisplay();
	
	public void playRound(){
		for(Player player : players)
			player.takeTurn();
	}
	
	public void addPlayer(String playerName){
		players.add(new Player(playerName, board.getStartingSpace(), display));
	}
	
	public void start(){
		for(int i = 0; i < 10; i++){
			playRound();
			System.out.println();
		}
	}
}
