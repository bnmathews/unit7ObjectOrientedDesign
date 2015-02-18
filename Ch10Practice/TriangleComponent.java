import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class TriangleComponent extends JComponent
{
    private Point2D[] coords;
    private int coordCount;
    private MListener listener;    
    
    public TriangleComponent()
    {
        MListener listener = new MListener();
        
        add(listener);
        
        Point2D[] coords = new Point2D[3];
        
        int coordCount = 0;
    }

    
    public void paintComponent(Graphics g) 
    {
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        //this.draw(g2);
    }
    
    private void setPoint(int x, int y)
    {
        
    }
   
    public class MListener implements MouseListener
    {
        
        public void mouseClicked(MouseEvent e)
        {
            System.out.println("Mouse Clicked!");
            /*
            if (coordCount < 2)
            {
                coordCount++;
                coords[coordCount] = e.getPoint();
            }
            else
            {
                coordCount = 0;
                coords[coordCount] = e.getPoint();
                System.out.println("Point 1: " + coords[0]);
                System.out.println("Point 2: " + coords[1]);
                System.out.println("Point 3: " + coords[2]);
            }
            this.returnCoords();
            System.out.println("C: " + coordCount);
            */
            setPoint( e.getX(), e.getY() );
        }
        
        public void mousePressed(MouseEvent e)
        {
            
        }
        
        public void mouseReleased(MouseEvent e)
        {
            
        }
        
        public void mouseEntered(MouseEvent e)
        {
            
        }
        
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
}