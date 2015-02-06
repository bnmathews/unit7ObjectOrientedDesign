import java.util.ArrayList;
import java.util.Collections;
public class Coin implements Comparable
{
   private double value;
   private String name;
   
   public Coin( double value,String name )
   {
       this.value = value;
       this.name = name;
   }
   
   public int compareTo( Object otherObject ) //can use generics to get Coins here
   {
       Coin other = (Coin) otherObject;
       if ( this.value < other.value )
       {
           return -1;
       }
       else if ( this.value > other.value )
       {
           return 1;
       }
       else
       {
           return 0;
       }
   }
   
   public String toString()
   {
       return name + " " + value;
   }
   
   public static void main( String[] args )
   {
       Coin quarter = new Coin(0.25, "quarter");
       Coin dime = new Coin(0.10, "dime");
       
       Comparable quarterObj = quarter; // will not work if Coin doesn't implement Comparable
       Comparable dimeObj = dime;
       
       if ( dimeObj.compareTo( quarterObj ) > 0 )
       {
           System.out.println( "dime is more than quarter" );
       }
       
       ArrayList<Coin> list = new ArrayList<Coin>();
       list.add( quarter );
       list.add( dime );
       System.out.println( list );
       Collections.sort( list ); //'Collections' uses Comparable's compareTo method, so it needs to know that 
                                 //the quarter and dime objects implement Comparable, hence quarterObj and dimeObj
       System.out.println( list );
   }
}
