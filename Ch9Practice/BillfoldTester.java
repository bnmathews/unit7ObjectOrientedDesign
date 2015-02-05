public class BillfoldTester
{
    public BillfoldTester()
    {
    }

    public static void main(String[] args)
    {
        Billfold b = new Billfold();
        
        System.out.println("Adding two cards...\n");
        
        //b.addCard(new CallingCard("Buttman McButtington III","8888888881",987654321));
        b.addCard(new DriverLicense("Mr. Future Man",3076));
        b.addCard(new DriverLicense("Mr. Future Man",3076));
        //b.addCard(new IDCard("IDTEST",2222));
        
        System.out.println(b.formatCards());
        System.out.println("\nNumber of expired cards: " + b.getExpiredCardCount());
        
        System.out.println("\nAre these cards equal?");
        if (b.checkEquals())
        {
            System.out.println("Yep!");
        }
        else
        {
            System.out.println("Nope.");
        }
    }
}
