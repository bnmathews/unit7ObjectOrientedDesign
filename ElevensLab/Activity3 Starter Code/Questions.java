public class Questions
{
    public static void flip(int timesToFlip)
    {
        for (int i = 0; i < timesToFlip; i++)
        {
            int flipchance = (int)(Math.random()*2);
            if ( timesToFlip % 2 == 0 )
            {
                System.out.println("heads");
            }
            else
            {
                if (flipchance == 1)
                {
                    System.out.println("tails");
                }
                else
                {
                    System.out.println("heads");
                }
            }
        }
    }
    
    public static void arePermutations()
    {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,3,2,5,4};
       
        for (int i = 0; i < ar1.length;)
        {
            //System.out.println(ar1.indexOf(ar2[i]));
        }
    }
}
