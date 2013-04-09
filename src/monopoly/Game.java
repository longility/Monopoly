package monopoly;
import java.util.*;

public class Game {
	ArrayList<Player> players; 
	Board board; 
	
	public Game(){
		players = new ArrayList<Player>();
		board = new Board();
	}
	
	public void takeTurn(){
		for(Player player : players){
			player.roll();
			player.move();
			player.playerChanged();
		}
	}
	
	public Board getBoard(){
		return board;
	}
	
	public void addPlayer(Player p){
		players.add(p);
	}
	

	public static void main(String[] args) {
		Game game = new Game();
		PlayerDisplay display = new PlayerDisplay();
		
		
		game.addPlayer(new Player("Tom", game.getBoard().getSpace(0), display));
		game.addPlayer(new Player("Ally", game.getBoard().getSpace(0), display));
		game.addPlayer(new Player("Paul", game.getBoard().getSpace(0), display));
		game.addPlayer(new Player("Amy", game.getBoard().getSpace(0), display));
		
		for(int i = 0; i < 10; i++){
			game.takeTurn();
			System.out.println();
		}
	}
}
