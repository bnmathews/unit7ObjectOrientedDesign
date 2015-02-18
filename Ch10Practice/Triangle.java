import javax.swing.JComponent;
import javax.swing.JFrame;

public class Triangle //could extend JFrame to make this its own frame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    private JFrame frame;
    private JComponent component;
    
    public Triangle()
    {
        frame = new JFrame();
        
        TriangleComponent component = new TriangleComponent();
        
        frame.add(component);
        
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        Triangle tri = new Triangle();
    }
}
