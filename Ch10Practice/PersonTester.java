import java.util.Scanner;
public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Person[] people = new Person[10];
        for (Person p : people)
        {
            System.out.print("Input the person's name: ");
            p = new Person(s.next());
        }
        
        for (int i = 0; i < people.length; i++)
        {
            for (int j = 0; j < people.length; j++)
            {
                if (people[j].compareTo(people[i]) < 1)
                {
                    people[i] = people[j];
                }
                else if (people[j].compareTo(people[i]) > 1)
                {
                    people[j] = people[i];
                }
            }
        }
        
        for (Person p : people)
        {
            System.out.println(p);
        }
    }
}
