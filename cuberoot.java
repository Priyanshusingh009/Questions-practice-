/* Display Cubes of Numbers
Write a Java program to display the cube of the given number up to an integer.*/
import java.util.Scanner;
public class cuberoot {
    public static void main(String[] arg){
        System.out.print("ENTER THE NUMBER = ");
        Scanner input=new Scanner(System.in);
        double num=input.nextDouble();        
        double cube=Math.pow(num,3);
        System.out.println("The no. is = "+num +"and the cube of the no. is = "+cube );
        
    }
    
}
