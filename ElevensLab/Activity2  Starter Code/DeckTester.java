/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    private Deck deck1;
    private Deck deck2;
    private Deck deck3;
    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        Deck deck1 = new Deck(new String[] {"1","2","3"}, new String[] {"Diamonds","Hearts","Spades"}, new int[] {1,2,3});
        Deck deck2 = new Deck(new String[] {"Ace","Jack","Queen"}, new String[] {"Spades","Spades","Diamonds"}, new int[] {13,10,11});
        Deck deck3 = new Deck(new String[] {"King","5","7"}, new String[] {"Hearts","Diamonds","Clubs"}, new int[] {12,5,7});
        
        System.out.println(deck1);
        System.out.println(deck2);
        System.out.println(deck3);
    }
}
