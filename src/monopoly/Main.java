package monopoly;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game();
		
		game.addPlayer("Tom");
		game.addPlayer("Ally");
		game.addPlayer("Paul");
		game.addPlayer("Amy");

		game.play();
	}
}
	