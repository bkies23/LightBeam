package LightBeam;

/* Programmer Brian Kies */

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;
 
// Main Frame will hold upper and lower panels
// Main Frame uses BorderLayout for panels and each panel uses GridBagLayout

public class LightBeam extends JFrame 
{
    Color teal = new Color (32, 178, 170);
    String feetOrMiles;  // first three distances are in feet; remaining distances are in miles
    DecimalFormat decimalFormat1 = new DecimalFormat("#,###.00");
   
    public LightBeam(int width, int height)
    {
     
        setSize(new Dimension (width, height));
        setLayout(new BorderLayout());
        setTitle("Right Triangle Surface Distances");
        // UpperHalfPanel contains text about program with image of light beam from ten-foot pole 
        // and chalkboards to the left and right that display tangent function information
        UpperHalfPanel upperHalfPnl = new UpperHalfPanel( );
        // LowerHalfPanel contains images showing various distances for selected angles
        LowerHalfPanel lowerHalfPnl = new LowerHalfPanel(width, height);
        
        add(upperHalfPnl, BorderLayout.NORTH);
        add(lowerHalfPnl, BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
        //Set minimum size for window where Upper and Lower Panels will continue to function
        setMinimumSize(new Dimension (1410, 940));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {
        LightBeam rayOfLight = new LightBeam (1500, 950); // initial dimensions
        
        rayOfLight.setVisible(true);    
    }   
}
