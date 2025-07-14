import java.util.Scanner;
import java.util.Arrays;
public class remove_elementofarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] my_array={89,34,56,4,};
        System.out.println(" original array \n"+Arrays.toString(my_array));
        int removeIndex=input.nextInt();
        for(int i=removeIndex;i<my_array.length -1;i++){
            my_array[i]=my_array[i+1];
        }
        int[] new_array= new int[my_array.length-1];
        for(int i=0;i<new_array.length;i++){
            new_array[i]=my_array[i];
        }
        System.out.println("modified array \n "+Arrays.toString(new_array));
            
    }
}
       

    
    

