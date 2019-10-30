
import info.gridworld.actor.Bug;

public class ColumnBug extends Bug
{
  public void turn()
    {
        setDirection(getDirection() + 180);
    } 
  
}
