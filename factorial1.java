import java.util.Scanner;
public class factorial1{
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
       
        }
         else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number = ");
        int x=input.nextInt();
        System.out.println("Factorial is "+factorial(x));
        
    }

}