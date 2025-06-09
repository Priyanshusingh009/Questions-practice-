/*15. Sum of Odd Natural Numbers

Write a Java program that displays the sum of n odd natural numbers */
import java.util.Scanner;
public class sumofoddno {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("for how many odd no.s you want sum = ");
        int oddnum=input.nextInt();
        
        int inc=1;
        int sumodd=0;
        while(inc<=oddnum){
            System.out.println("enter the no.s one by one");
            int nums=input.nextInt();
            if(nums%2!=0){
                sumodd+=nums;
                inc+=1;
            }
            else{
            System.out.println("this is not a odd no.");
            }
        }
        System.out.println( "sum of 'n' odd no.s is "+sumodd);

    }

    
     



}
