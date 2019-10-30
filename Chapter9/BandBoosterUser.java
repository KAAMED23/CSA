import java.util.Scanner;
public class BandBoosterUser
{
        public static void main(String[] args){
           Scanner kb = new Scanner(System.in);
           System.out.println("What's the name of the first Booster");
           BandBooster b1 = new BandBooster(kb.nextLine());
           System.out.println("What's the name of the second Booster");
           BandBooster b2 = new BandBooster(kb.nextLine());
           System.out.println("What's the name of the third Booster");
           BandBooster b3 = new BandBooster(kb.nextLine());
           System.out.println("How many weeks will this program last");
           int weeks = kb.nextInt();
           for (int i = 1; i<=weeks; i++){
            System.out.println("How many boxes did "+ b1.getName()+" sell");
            b1.updateSales(kb.nextInt());
            System.out.println("How many boxes did "+ b2.getName()+" sell");
            b2.updateSales(kb.nextInt());
            System.out.println("How many boxes did "+ b3.getName()+" sell");
            b3.updateSales(kb.nextInt());
            }
           System.out.println(b1.toString());
           System.out.println(b2.toString());
           System.out.println(b3.toString());
        
        
        
        
        
        }  
}
