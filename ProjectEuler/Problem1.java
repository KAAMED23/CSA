
public class Problem1
{
   public static void main(String[] args){
    int num = 0;
    int res = 0;
    while (num < 1000){
        if ((num%3)==0 || (num%5)==0)
        res += num;
        num++;
    } 
    System.out.println(res);
}}
