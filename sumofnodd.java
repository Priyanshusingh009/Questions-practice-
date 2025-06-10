import java.util.Scanner;
public class sumofnodd{
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("for how many first odd no.s you want sum  ");
        int oddnum=input.nextInt();
        int inc=0;
        int store=0;
        int sum=1;
        while(inc<oddnum){
            store=store + sum;
            sum+=2;            
            inc+=1;
        }
        System.out.println(" sum of first n narural no. is = " + store  );
    }

}