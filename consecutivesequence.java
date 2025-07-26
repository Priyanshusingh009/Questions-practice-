import java.util.Arrays;
public class consecutivesequence {
    
    public static void main(String[] args) {
        int[] array= {49, 1, 3, 200, 2, 4, 70,6,7, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int len=array.length;
        int index=1;
       
        for(int i=1;i<array.length;i++){
            if(array[i]==array[i-1]){
                continue;
            }
            
            if(array[i]==array[i-1]+1){
                
                index++;
            }
            
        }
        System.out.print("the longest consecutive no.s count is "+index);

        
    }
}
