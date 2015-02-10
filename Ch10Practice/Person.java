public class Person implements Comparable
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    public int compareTo( Object other )
    {
        Person otherPerson = (Person) other;
        return name.compareTo(otherPerson.name);
    }
    
    public String toString()
    {
        return name;
    }
}
