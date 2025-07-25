import java.util.*;
public class evenOddCount {
    public static void main(String[] args) {
        int[] array= {32,34,5,6,8,9};
        int even =0;
        int odd =0;
    for(int i : array){
        if(i%2==0){
           even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("Total count of even no.s are "+even );
    System.out.println("total count of odd no.s are "+odd);
    }
    
}
