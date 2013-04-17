package monopoly;
import java.util.*;

public class MonopolyGame {
	ArrayList<GamePlayerClient> players = new ArrayList<GamePlayerClient>(); 
	Board board = new Board(); 
	PlayerDisplay display = new PlayerDisplay();
	
	public void playRound(){
		for(GamePlayerClient player : players)
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
