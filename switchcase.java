import java.util.Scanner; 
public class switchcase{
    /*1. Write a java program that uses a switch statement to 
    print the name of the month corresponding to a given integer value. */       
    public static void main(String[] arg){
        Scanner months=new Scanner(System.in);
        System.out.println("enter the no. betwwen 1-12 =");
        int month = months.nextInt();
        switch (month) {
            case 1:
               System.out.println("JANUARY");
               break;
            case 2:
               System.out.println("FEBUARY");
               break;
            case 3 :
               System.out.println("MARCH ");
               break;
            case 4 :
               System.out.println("APRIL ");
               break;
            case 5:
               System.out.println("MAY ");
               break;
            case 6 :
               System.out.println("JUNE");
               break;
            case 7 :
               System.out.println("JULY ");
               break;
            case 8 :
               System.out.println("AUGUST ");
               break;
            case 9 :
               System.out.println("SEPTEMBER ");
               break;
            case 10 :
               System.out.println("OCTOBER ");
               break;
            case 11 :
               System.out.println("NOVEMBER ");
               break;
            case 12 :
               System.out.println("DECEMBER ");
               break;  
            default :
               System.out.println(" there are only 12 months so please insert no.s betwwen 1-12");
        }

        
    }
}