import java.util.Scanner;
public class lengthofnumber {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NNUMBER = ");
        int num=input.nextInt();
        int len=0;
        int flag1=Math.abs(num);       
        while(flag1>0){
            flag1=flag1/10;
            len++;
            
        }
        System.out.println("THERE ARE " + len + " DIGITS IN THIS NUMBER ");
        
        


    } 
    
}
