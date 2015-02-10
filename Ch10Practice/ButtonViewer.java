import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 150;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;
    
    public ButtonViewer()
    {
        frame = new JFrame();
        buttonA = new JButton( "A" );
        buttonB = new JButton( "B" );
        
        label = new JLabel( "No button clicked." );
        
        panel = new JPanel();
        
        panel.add(label);
        panel.add(buttonA);
        panel.add(buttonB);
        
        frame.add(panel);
        
        ActionListener listener = new ClickListener(); //ClickListener implements ActionListener
        
        /*
        ActionListener listener = new ActionListner()
            {
                public void actionPerformed( ActionEvent event )
                {
                    label.setText( "Button " + event.getActionCommand() + " was clicked!");
                }
            };
        */
       
        buttonA.addActionListener( listener );
        buttonB.addActionListener( listener );
        
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
        
    class ClickListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event )
        {
            label.setText( "Button " + event.getActionCommand() + " was clicked!");
        }
    }
    
    public static void main(String[] args)
    {
        ButtonViewer bv = new ButtonViewer();
    }
}
