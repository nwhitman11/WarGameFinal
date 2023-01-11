
public class App {

	public static void main(String[] args) {
		App wg = new App();
		wg.playGame();
	}
		// Initialize the deck and print it
	private void playGame() {
		Deck d = new Deck ();
		Card.shuffle();
		Player p = new Player(); // create a new instance each run through
		p.setName("Player 1");;
		Player p2 = new Player ();
		p2.setName("Player2");
		//System.out.println(d.getCards().size());
		drawCards(d, p , p2);
		flipCards(p,p2);
		findWinner(p,p2);
	}
	
	private void drawCards( Deck d, Player p, Player p2) {
		for(int i=1; i<=26; i++) {
			p.draw(d);
			p2.draw(d); // by the end of this method, each player will have 26 cards.
			
		}
	}
	
	private void flipCards(Player p, Player p2) { // return the card that is top of hand
		for(int i = 1; i<= 26; i ++) {
			Card toHp = p.flip();
			Card toHp2 = p2.flip();
			if(toHp.getValue()>toHp2.getValue()) { // This gives us the scoring part if player1 or 2 wins
				p.incrementScore();
			} else {
				p2.incrementScore();
			}
			
		}
	}
	
	private void findWinner(Player p, Player p2) {
		if(p.getScore()> p2.getScore()) {
			System.out.println("Player one wins" + p.getScore());
		} else if (p2.getScore() >p.getScore()) {
			System.out.println("Player two wins with a score of " + p2.getScore());
		} else {
			System.out.println("Draw");
		}
	}
	
	
	
}
