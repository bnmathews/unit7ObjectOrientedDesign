public class Billfold
{
    private Card card1;
    private Card card2;
    public Billfold()
    {
    }

    public void addCard(Card c)
    {
        if (card1 == null)
        {
            card1 = c;
        }
        else
        {
            if (card2 == null)
            {
                card2 = c;
            }
        }
    }
    
    public int getExpiredCardCount()
    {
        int expired = 0;
        
        if (card1.isExpired())
        {
            expired++;
        }
        
        if (card2.isExpired())
        {
            expired++;
        }
        
        return expired;
    }
    
    public String formatCards()
    {
        String str = "";
        str += card1.format();
        str += "\n------------------\n" + card2.format();
        return str;
    }
    
    public boolean checkEquals()
    {
        if (card1.equals(card2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
