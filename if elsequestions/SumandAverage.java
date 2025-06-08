import java.util.Scanner;
public class SumandAverage {
/*Sum and Average of 5 Numbers

Write a program in Java to input 5 numbers from the keyboard
and find their sum and average. */
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("for how many no.s would you like to find the average");       
        int times=input.nextInt();
        int increment=0;
        int sum=0;
        System.out.println("enter the no one by one");
        while(increment<times){
            int num=input.nextInt();
            increment++;
            sum+=num;

        }
        System.out.println("your avarage is : "+sum/times);
        
        

    }
    
}
