import java.util.Scanner;
import java.util.Random;
public class Rockpaperscissor {
   public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter 0 for rock,1for paper,2 scissor");
      int userin=input.nextInt();
      Random random=new Random();
      int compin=random.nextInt(3);
      if(compin==userin){
         System.out.println("MATCH DRAW");
         
      }
      else if(userin==0 && compin==2 || userin==2 && compin==1 || userin==1 && compin==0 ){
         System.out.println("YOU WIN ");
      }else{
         System.out.println("COMPUTER WIN ");
      }

    

   }
    
    


    
}
