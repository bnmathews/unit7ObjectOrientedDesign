public class Card
{
   private String name;
   
    public Card()
   {
      name = "";
   }
   
   public Card(String n) //this is what gets called from super()
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public String toString()
   {
       String str = "";
       str += "Card[name=" + name + "]";
       return str;
   }
   
   public boolean equals(Object card2)
   {
       if (this.getClass() == card2.getClass())
       {
           Card othercard = (Card)card2;
           if (name.equals(othercard.name)) //since we are a Card, we can access private vars of other Cards
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