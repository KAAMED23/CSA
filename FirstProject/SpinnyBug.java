import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import java.awt.Color;



public class SpinnyBug extends Bug
{
    public SpinnyBug()
    {
        setColor(Color.GREEN);
    }
    public void turn(){
        setDirection(getDirection() + Location.HALF_RIGHT);
    }
    public void act()
    {
            turn();
    }
}
