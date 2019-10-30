
public class Problem2
{   public static void main(String[] args){
    int fnum = 0;
    int snum = 1;
    int newnum = 0;
    int sol = 0;
   
    
    while (newnum <= 4000000){
        newnum = fnum+snum;
        fnum = snum;
        snum = newnum;
        
        if ((newnum % 2)==0)
        sol += newnum;
    
    
    
    }
    System.out.println(sol);
}
}
