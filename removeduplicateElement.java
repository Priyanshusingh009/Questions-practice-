import java.util.Arrays;
public class removeduplicateElement{
    public static void main(String[] args) {
        int[] my_array={89,34,4,67,89,56,34,4,};
        System.out.println("original array" + Arrays.toString(my_array));
        Arrays.sort(my_array);
        int x=0;
        int[] new_array= new int[my_array.length];
        for(int i=1;i<my_array.length;i++){
            if(my_array[x]!=my_array[i]){
                new_array[x]=my_array[x];

                
                x++;
            }else{
                x++;
                continue;
            }


        }
        System.out.println("modified array is " +Arrays.toString(new_array) );
    }
}