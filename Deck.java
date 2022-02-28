import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> deck;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise instance variables
        deck = new ArrayList<Card>();
        String[] shape = {"Hearts", "Spades", "Diamonds", "Clubs"};

        for(int i = 0; i < shape.length; i++){
            String indicator = shape[i];
            for(int j = 1; j <= 13; j++){
                deck.add(new Card(indicator,j));
            }
        }
    }

    public Card drawRandomCard(){
        return deck.remove((int)(Math.random() * (deck.size())));
    }
}
