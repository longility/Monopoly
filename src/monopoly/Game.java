package monopoly;
import java.util.*;

public class Game {
	ArrayList<Player> players; 
	Board board; 
	PlayerDisplay display = new PlayerDisplay();
	
	public Game(){
		players = new ArrayList<Player>();
		board = new Board();
	}
	
	public void roundOfTurns(){
		for(Player player : players)
			player.takeTurn();
	}
	
	public Board getBoard(){
		return board;
	}
	
	public void addPlayer(String playerName){
		players.add(new Player(playerName, getBoard().getSpace(0), display));
	}
	
	public void play(){
		for(int i = 0; i < 10; i++){
			roundOfTurns();
			System.out.println();
		}
	}
}
