import java.awt.Rectangle;

/**
   Objects of this class measure rectangles by area.
*/
public class AreaMeasurer implements Measurer // can add <Rectangle> here to be able to pass a Rectangle in place of an Object
{
   public double measure(Object anObject)
   {
      Rectangle aRectangle = (Rectangle) anObject;
      double area = aRectangle.getWidth() * aRectangle.getHeight();
      return area;
   }
}
