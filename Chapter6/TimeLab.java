import java.util.Scanner;

public class TimeLab
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number of milliseconds: ");
        String input = kb.nextLine();
        
        int num = Integer.parseInt(input);
        
        //int milliseconds = num % 3600000;
        //num /= 1000;
        //didn't end up doing this method because it wouldn't give milliseconds 
        //properly unless hours >= 1
        
        int hours = num / 3600000;
        num %= 3600000;
        
        int minutes = num / 60000;
        num %= 60000;
        
        int seconds = num / 1000;
        
        int milliseconds = num%1000;
       

        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
        System.out.println(milliseconds + " milliseconds");
        


    }
}
