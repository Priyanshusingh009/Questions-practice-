import java.util.Scanner;
public class checkelement {
    public static void main(String[] args) {
        int[] marks={45,67,890,68,54,34,66,55};
        System.out.println( marks);
        System.out.print("enter the marks you want to check = ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        for(int i:marks){
            if(i==num){
             sum+=1;
             break;
            }
            // else{
            //     System.out.println("ELEMENT NOT FOUND");
            //     break;
            // }
        }
        if(sum==1)
        System.out.println("ELEMENT FOUND");
        else{
            System.out.println("element not found");
        }
    }
    
}
