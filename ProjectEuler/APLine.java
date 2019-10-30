
public class APLine
{
  int a=0, b=0, c=0;
  public APLine(int i,int j,int k){
    a=i;
    b=j;
    c=k;
    }
  public double getSlope(){
      return (double)-a/b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y + c == 0;
    
  }
}
