import java.util.Scanner;
public class ifElse {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("aX^2 + bX + c=0");
        System.out.println("enter the value of a");
        int a= input.nextInt();
        System.out.println("enter the value of b");
        int b= input.nextInt();
        System.out.println("enter the value of c");
        int c= input.nextInt();
        int result=b*b-4*a*c;
        double r1=(-b + Math.pow(result, 0.5))/2*a;
        double r2=(-b - Math.pow(result, 0.5))/2*a;
        if( result>0){
            System.out.println("1st real root is "+r1);
            System.out.println("2nd real root is "+r2);
        } 
        else if( result==0.0){
            System.out.println("this equation have real and equal roots "+r1);

        }
        else{
            System.out.println("this quadratic equation has no real roots");

        }

        



    }
    
}
