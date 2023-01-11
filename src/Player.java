import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score; 
	private String name;
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Draw Method: the moment you draw a card, it will then add to the hand of the player
	public void draw(Deck d) {
		Card drawnCard =d.drawCard(); 
		hand.add(drawnCard);
		
	}
	// incrementScore method: adds 1 to the Player's score field
	public void incrementScore() {
		this.score++; // adds to the players score
	}
	//FLIP method: removes and returns the top card of the Hand
	public Card flip() {
		Card topOfHand = hand.get(0);
		hand.remove(0);
		return topOfHand;
	}
}
