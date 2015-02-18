import java.util.Scanner;
public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Person[] people = new Person[10];
        
        for (int p = 0; p < people.length; p++)
        {
            System.out.print("Input the person's name: ");
            people[p] = new Person(s.next());
        }
        
        Person curPerson = people[0];
        
        for (int j = 0; j < people.length; j++)
        {
            //this is still kinda broken, try to fix it later.
            curPerson = people[0];
            for (int i = 1; i < people.length; i++)
            {
                if (curPerson.compareTo(people[i]) > 0)
                {
                    people[i-1] = people[i];
                    people[i] = curPerson;
                }
                System.out.println("\n");
                for (Person p : people)
                {
                    System.out.println(p);
                }
            }
            
            System.out.println("\nPass #"+ (j+1) + ":");
            for (Person p : people)
            {
                System.out.println(p);
            }
        }
        
        System.out.println("\nAlphabetized:");
        for (Person p : people)
        {
            System.out.println(p);
        }
        
    }
}
