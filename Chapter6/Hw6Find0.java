
public class Hw6Find0
{
    public  static void main(String[] args){
      int a = 1;
      int b = 7;
      int c = 10;
        
      double d = Math.sqrt((double)b * b - 4.0 * a * c);
      double x1 = -((-b + d) /2.0*a);
      double x2 = -((-b - d) /2.0*a);
      
      System.out.println(d);
      System.out.println(x1);
      System.out.println(x2);
    
    }
}
