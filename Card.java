
/**
 * Stores the values of a card from a standard 52 card deck
 * 
 * @Alex Hadley 
 * @beta
 */
public class Card
{
    private int suit;
    private int cardVal;

    /**
     * Constructor for objects of class Card
     */
    public Card(int suit, int cardVal)
    {
        this.suit=suit;
        this.cardVal=cardVal;
    }

    public int getSuit()
    {
        return suit;
    }
    
    public int getCardVal()
    {
        return cardVal;
    }
}
