import java.util.ArrayList;
/**
 * Represents one game of toilet solitaire
 * 
 * @Alex Hadley
 * @beta
 */
public class Game
{
    private ArrayList<Card> myDeck = new ArrayList<Card>();

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        for(int i=1; i<5; i++)
        {
            for(int j=1; j<14; j++)
            {
                myDeck.add(new Card(i,j));
            }
        }
        shuffle();
    }

    public int numberLeft()
    {
        int num = myDeck.size();
        for(int i=3; i<myDeck.size(); i++)
        {
            if(myDeck.get(i).getSuit()==myDeck.get(i-3).getSuit())
            {
                myDeck.remove(i-1);
                myDeck.remove(i-2);
                i-=3;
            }
            else
            {
                if(myDeck.get(i).getCardVal()==myDeck.get(i-3).getCardVal())
                {
                    myDeck.remove(i);
                    myDeck.remove(i-1);
                    myDeck.remove(i-2);
                    myDeck.remove(i-3);
                    i-=4;
                }
            }
            if(i<2)
                i=2;
        }
        if(myDeck.size()==num || myDeck.size()<3)
            return myDeck.size();
        for(int i=0; i<4; i++)
            myDeck.add(myDeck.remove(0));
        return numberLeft();
    }
    
    private void shuffle()
    {
        ArrayList<Card> temp = new ArrayList<Card>();
        for(int i=0; i<52; i++)
        {
            int index=(int)(Math.random()*myDeck.size());
            temp.add(myDeck.remove(index));
        }
        myDeck=temp;
    }
}
