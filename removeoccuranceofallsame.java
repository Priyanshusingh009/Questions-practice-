//Write a Java program to remove all occurrences of a given value from an array
import java.util.Arrays;
import java.util.Scanner;
public class removeoccuranceofallsame {
    public static void main(String[] args) {
        System.out.println("ENTER THE NO YOU WANT TO REMOVE");
        Scanner input=new Scanner(System.in);
        int[] my_array={89,34,4,67,89,56,34,4,};
        int removeNo=input.nextInt();

        for(int i=0;i<my_array.length -1;i++){
            if(my_array[i]==removeNo){
                my_array[i]=my_array[i+1];
                // for(int j=i;j<my_array.length-i;i++){
                //     my_array[i]=my_array[i+1];
                // }
            }
        }

        int[] new_array= new int[my_array.length];
        for(int i=0;i<new_array.length ;i++){
            new_array[i]=my_array[i];
        }

        System.out.println("modified array \n "+Arrays.toString(new_array));

    }

    
}