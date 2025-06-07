/*Days in a Month
Write a Java program to find the number of days in a month. */
import java.util.Scanner;
public class ifelse_2Q {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE YEAR :");
        int year=input.nextInt();
        System.out.println("ENTER THE MONTH NO.:");
        int month=input.nextInt();
        int days=0;
        if(year%4==0){
            System.out.println("this is a leap year");
            if(month==2){
                days=29;}
            else if(month%2!=0){
                days=31;
            }
            else{
                days=30;}
            }           
         
        if(year%4!=0){
            if(month%2!=0){
                days=31;
            }
            else if(month==2){
                days=28;
            }
            else{
                days=30;
            }
        }
    System.out.println(year+ " month no. "+ month + " days "+ days);    
    }

}
    

