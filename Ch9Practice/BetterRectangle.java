import java.awt.Rectangle;
public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int wid, int hi, int x, int y)
    {
        //super.setSize(wid,hi);
        //super.setLocation(x,y);
        super(x,y,wid,hi);
    }
    
    public int getPerimiter()
    {
        return 2*(width * height);
    }
    
    public int getArea()
    {
        return width * height;
    }
}
