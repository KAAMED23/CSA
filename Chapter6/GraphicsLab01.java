// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsLab01 extends JPanel
{

    public void paintComponent(Graphics g)
    {
        //CUBE
        g.drawRect(25, 25, 200, 200);
        g.drawRect(88, 88, 200, 200);
        g.drawLine(25,25,88,88);
        g.drawLine(25,225,88,288);
        g.drawLine(225,25,288,88);
        g.drawLine(225,225,288,288);
        
        //SPHERE
        g.drawOval(100, 50, 100, 200);
        g.drawOval(125, 50, 50, 200);
        g.drawOval(75, 50, 150, 200);
        g.drawOval(50, 50, 200, 200);
        g.drawOval(50, 75, 200, 150);
        g.drawOval(50, 100, 200, 100);
        g.drawOval(50, 125, 200, 50);
        
        //INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(600,400,200,200);
        int [] x = {700,600,775,700};
        int [] y = {600,500,433,600};
        g.drawPolyline(x,y,4);
        g.drawOval(637,472,94,94);
       
        //APCS
        //a
        g.fillRect(400, 50, 20, 120);
        g.fillRect(400, 50, 60, 20);
        g.fillRect(450, 50, 20, 120);
        g.fillRect(400, 100, 60, 20);
        //p
        g.fillRect(490, 50, 20, 120);
        g.fillRect(490, 50, 60, 20);
        g.fillRect(540, 50, 20, 70);
        g.fillRect(490, 100, 60, 20);
        //c
        g.fillRect(580,50,20,120);
        g.fillRect(580,50,60,20);
        g.fillRect(580,150,60,20);
        //s
        g.fillRect(670,50,60,20);
        g.fillRect(670,150,60,20);
        g.fillRect(670,50,20,70);
        g.fillRect(670,100,60,20);
        g.fillRect(710,100,20,70);
        
        //PACMEN FLOWER
        g.fillArc(340,410,100,100,45,270);
        g.fillArc(200,410,100,100,225,270);
        g.fillArc(270,340,100,100,45,-270);
        g.fillArc(270,480,100,100,225,-270);
        

    }

    
    public static void main(String[] args){
          JFrame frame = new JFrame("GraphicsLab01");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(100, 100, 830, 630);
          frame.setContentPane(new GraphicsLab01());
          frame.setVisible(true);

          
        
    }
}

