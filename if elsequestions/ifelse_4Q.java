import java.util.Scanner;
public class ifelse_4Q {
/*Natural Numbers and Their Sum
Write a Java program to display n terms of natural numbers and their sum.
*/
    public static void main(String[] arg){
        System.out.println("enter the natural no. = ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        //for (i=1;i<=10;i++)
        int i=0;
        int sum=0;
        
        for (i=1;i<=num && i>0 ;i++){
           
           System.out.println(i);
           sum+=i;
        }
        
        if(num<0){
            System.out.println("the digit is not a whole no");
        }else{
            System.out.println("the sum is " + sum);
        }


    }
    
}
