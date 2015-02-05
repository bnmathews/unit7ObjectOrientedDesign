import java.util.GregorianCalendar;
public class DriverLicense extends Card
{
    private int expYear;
    public DriverLicense(String n, int year)
    {
        super(n);
        expYear = year;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar cal = new GregorianCalendar();
        if (expYear < cal.get(cal.YEAR))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public String format()
    {
        String str = "";
        str += "NAME: " + super.getName() + "\n";
        str += "EXPIRATION YEAR: " + expYear;
        return str;
    }
    
    public String toString()
    {
        String str = "";
        str += "DriverLicense[name=" + super.getName() + "][expYear=" + expYear + "]";
        return str;
    }
    
    public boolean equals(Object card2)
    {
        if (this.getClass() == card2.getClass())
        {
            DriverLicense newlic = (DriverLicense)card2;
            if (this.getName().equals(newlic.getName()) && expYear == newlic.expYear)
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
