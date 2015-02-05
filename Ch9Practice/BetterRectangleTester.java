public class BetterRectangleTester
{
    public BetterRectangleTester()
    {
    }
    
    public static void main(String[] args)
    {
        BetterRectangle rect = new BetterRectangle(20,10,0,0);
        System.out.println("The area of the rectangle is: " + rect.getArea());
        System.out.println("The perimiter of the rectangle is: " + rect.getPerimiter());
    }

}
