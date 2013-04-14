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
	
	public void addPlayer(Player p){
		players.add(p);
	}
	
	public void createPlayers(){
		addPlayer(new Player("Tom",getBoard().getSpace(0), display));
		addPlayer(new Player("Ally", getBoard().getSpace(0), display));
		addPlayer(new Player("Paul", getBoard().getSpace(0), display));
		addPlayer(new Player("Amy", getBoard().getSpace(0), display));
	}
	
	public void play(){
		for(int i = 0; i < 10; i++){
			roundOfTurns();
			System.out.println();
		}
	}
}
