
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
 //field attributes
 //access type variable
 private int sideLength;
 private int segment;
 private int steps;
 //private int steps, segment, sideLength;
 
 
 //constructor same name as class
 public SpiralBug(){
     sideLength = 1;
     segment = 0;
     steps = 0;
    }    
    public void act(){
        if (steps < sideLength){
            move();
            steps++;
        }else{
            turn();
            turn();
            segment++;
            steps = 0;
        if (segment == 2){
            sideLength++;
            segment = 0;
        }
        }
    
    }
}
