import java.util.Scanner;
public class fractionandwholepart {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NNUMBER = ");
        float num=input.nextFloat();
        
        int whole=(int)num/1;
        float frac=num%1;
        System.out.println("whole part is = "+whole);
        System.out.println("Fraction part is = "+frac);
        
    }

    
}
