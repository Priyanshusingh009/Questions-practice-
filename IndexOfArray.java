//Find the index of an array element
import java.util.Scanner;
public class IndexOfArray {
    public static void main(String[] args) {
        // creating array
        int[] data= {45,67,87,42,64};
        Scanner input= new Scanner(System.in);
        System.out.println("ENTER THE NO YOU WANT TO FIND IN ARRAY");
        int userinput=input.nextInt();
        int bound=data.length ;       
        int adrs=0;
        
        for(int i : data){
            adrs+=1;
            if(i==userinput){
              System.out.println("THE INDEX OF THE NO. IS = " + (adrs -1));
              break; // if i dont add break here adrs still incremented till all elements are not itrreted
            }
        
        if(adrs==bound){
            System.out.println("ELEMENT NOT FOUND IN ARRAY");
        }



         }
    }
}
    

