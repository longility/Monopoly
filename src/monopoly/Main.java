package monopoly;

public class Main {
	
	public static void main(String[] args) {
		MonopolyGame game = new MonopolyGame();
		
		game.addPlayer("Tom");
		game.addPlayer("Ally");
		game.addPlayer("Paul");
		game.addPlayer("Amy");

		game.start();
	}
}
	