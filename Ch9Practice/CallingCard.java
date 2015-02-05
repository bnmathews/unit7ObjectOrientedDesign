public class CallingCard extends Card
{
    private String cardNum;
    private int pin;
    public CallingCard(String n, String num, int pin)
    {
       super(n);
       cardNum= num;
       this.pin = pin;
    }
    
    public String format()
    {
        String str = "";
        str += "NAME: " + super.getName() + "\n";
        str += "CARD NUMBER: " + cardNum + "\n";
        str += "PIN: " + pin;
        return str;
    }
    
    public String toString()
    {
        String str = "";
        str += "CallingCard[name=" + super.getName() + "][cardNum=" + cardNum + "][pin=" + pin + "]";
        return str;
    }
    
    public boolean equals(Object card2)
    {
        if (this.getClass() == card2.getClass())
        {
            CallingCard newcalling = (CallingCard)card2;
            if (this.getName().equals(newcalling.getName()) && cardNum == newcalling.cardNum && pin == newcalling.pin)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
