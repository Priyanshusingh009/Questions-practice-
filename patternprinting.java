import java.util.Scanner;
public class patternprinting{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int news=0;
        for(int i=1;i<=rows;i++){
            for(int j = 1;j<=i;j++){
               System.out.print("* ");
            }
            System.out.println();
            news++;
            if(news>=rows){
                for(int k =news;k>0;k--){
                   for(int l=1;l<k;l++){
                     System.out.print("* ");
                    }
                System.out.println(" ")  ;  
            }
        
       
            }
        }    

    }
}
            
    
        
        
        
