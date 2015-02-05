public class IDCard extends Card
{
    private int idNumber;
    public IDCard(String n, int id)
    {
        super(n);
        idNumber = id;
    }
    
    public String format()
    {
        String str = "";
        str += "NAME: " + super.getName() + "\n";
        str += "ID: " + idNumber;
        return str;
    }
    
    public String toString()
    {
           String str = "";
           str += "IDCard[name=" + super.getName() + "][idNumber=" + idNumber + "]";
           return str;
    }
    
    public boolean equals(Object card2)
    {
        if (this.getClass() == card2.getClass())
        {
            IDCard newid = (IDCard)card2; //casts card2 to an id card so we can get its instance variables
            if (this.getName().equals(newid.getName()) && idNumber == newid.idNumber) //can just return this
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
