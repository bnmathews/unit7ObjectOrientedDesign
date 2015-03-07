Activity 3 Questions
1. public String flip()
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
    
2.  (import java.util.Arrays first)
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
    
3. 0,1,2,3