import java.util.Arrays;
/**
 * Write a description of class Questions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Questions
{
    public static String flip()
    {
        int flipchance = (int)(Math.random()*3);
        if (flipchance < 2)
        {
            return("heads");
        }
        else
        {
            return("tails");
        }
    }
    
    public static boolean arePermutations(int[] ar1, int[] ar2)
    {
        boolean doesWork = true;
        if (ar1.length == ar2.length)
        {
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            if (Arrays.equals(ar1,ar2))
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
    
    public static void main(String[] aaaaaaargs)
    {
        System.out.println(flip());
        System.out.println( arePermutations(new int[]{1,2,3},new int[]{3,1,2}));
    }
}
