import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.geom.Ellipse2D;
import java.awt.Point;

public class Triangle
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    private JFrame frame;
    private JPanel panel;
    private JComponent component;
    
    public Triangle()
    {
        frame = new JFrame();
        
        //label = new JLabel( "No button clicked." );
        
        panel = new JPanel();
        
        //panel.add(label);
        
        TriComponent component = new TriComponent();
        
        MListener listener = new MListener();
        
        component.addMouseListener(listener); //yes, you CAN add a listener to a component

        //frame.add(panel);
        
        frame.add(component);
        
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        
    }
    
    public class TriComponent extends JComponent
    {
        public void paintComponent(Graphics g) 
        {
            Graphics2D g2 = (Graphics2D) g;
            
            Dot d = new Dot(5,5);
            d.draw(g2);
        }
    }
    
    public class Dot
    {
        private int x;
        private int y;
        
        public Dot(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        
        public void draw(Graphics2D g2)
        {
            Ellipse2D.Double body1 = new Ellipse2D.Double(x, y, 5, 5);
            g2.fill(body1);
        }
    }
   
    public class MListener implements MouseListener
    {
        Point[] coords = new Point[3];
        int coordCount = 0;
        
        public void mouseClicked(MouseEvent e)
        {
            System.out.println("Mouse Clicked!");
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
        }
        
        public Point[] returnCoords()
        {
            return coords;
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
    
    public static void main(String[] args)
    {
        Triangle tri = new Triangle();
    }
}
