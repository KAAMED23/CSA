
public class FreeResponse
{
    int limit = 0;
    int days = 0;
    int active = 0;
    int dailySteps =0;
    public FreeResponse(int limit1){
        limit = limit1;
    
    }
    public void addDailySteps(int steps){
        dailySteps+= steps;
        if (steps >= limit)
        active++;
        days++;
    }
    public int activeDays(){
        return active;
    }    
    public double averageSteps(){
    return (double)dailySteps/days;
    }
}  

