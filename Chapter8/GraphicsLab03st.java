// GraphicsLab03st.java
// Student Version

import javax.swing.JFrame;
import javax.swing.JPanel;                                      
import java.awt.Graphics;
import java.awt.Color;
public class GraphicsLab03st extends JPanel
{
    
    public void paintComponent(Graphics g)  
    {
        // Draw Grid
        g.drawRect(10,10,800,600);
        g.drawLine(410,10,410,610);
        g.drawLine(10,310,810,310);
        
        
        
        // Draw Random Lines
        for(int i = 0; i<100; i++){
          g.setColor(randColor());
          g.drawLine(randBetween(10, 410),randBetween(10, 310),randBetween(10, 410),randBetween(10, 310));
          
          
          }



                
        
        // Draw Random Squares
        for(int i = 0; i<100; i++){
		  g.setColor(randColor());
		  g.fillRect(randBetween(410, 760),randBetween(10, 260),50,50);
		  
		  
		  }



        
        // Draw Random Circles

        for(int i = 0; i<100; i++){
		  g.setColor(randColor());
		  int j = randBetween(0, 200);
		  g.drawOval(randBetween(10, (410-j)),randBetween(310, (610-j)),j,j);
		  
		  
		  }
	
		  
	// Draw Concentric Circles
        for(int i = 1; i<21; i++){
            g.setColor(randColor());
            int j = i*10;
            g.drawOval((610-j),310, (2*j), 300);

            }
    
    
    
    }
    
    private int randBetween(int low, int high){
       return (int)(Math.random()*(high-low+1))+low;
       }
    private Color randColor(){
       int r = randBetween(0,255);
       int g = randBetween(0,255);
       int b = randBetween(0,255);
       return new Color(r, g, b);
       }

    public static void main(String[] args){
        JFrame frame = new JFrame("Graphics Lab 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 850, 650);
        JPanel panel = new GraphicsLab03st();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}



    
 