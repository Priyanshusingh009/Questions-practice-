/*Write a Java program to perform integer division rounding
 up to nearest small no. without using built-in rounding functions */
import java.util.Scanner;
public class roundoff{
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no. = ");
        float num=input.nextFloat();
        int conv=(int)num;
        //conv/=1;
        System.out.println("nearest integer is = "+conv);
    }
}