
public class Problem14
{ 
    public static void main(String[] args){
        long bn = 0;
        long count = 0;
        
        for(long n = 1; n < 1000000; n++){
        long nn = n;
        long nnew = n;
        long track = 0;
        while (nn!=1){
        if (nn%2 == 0){
        nn /= 2;
        track++;}
        else{
        nn = 3*nn + 1;
        track++;}
    }
        if (track > count){
        count = track;
        bn = nnew;
        
    }
    
    }
    System.out.println(count);
    System.out.println(bn);
    
}
}

