public class BandBooster
{   
    String name;
    int BoxesSold;
     public BandBooster(String name1){
     name = name1;
     BoxesSold = 0;
    }
    public String getName(){
    return name;
    }
    public void updateSales(int newSales){
    BoxesSold += newSales;
    }
    public String toString(){
        return name + ": " + BoxesSold + " boxes";
    } 
}
