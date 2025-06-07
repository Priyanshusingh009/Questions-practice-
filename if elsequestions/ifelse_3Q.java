/* Check Vowel or Consonant
Write a Java program that requires the user to enter a single ch from the
alphabet. Print Vowel or Consonant, depending on user input.
If the user input is not a letter (between a and z or A  and Z),
 or is a string of length > 1, print an error message.
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant */
import java.util.Scanner;
public class ifelse_3Q {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER");
        char ch=input.next().charAt(0);
        ch = Character.toUpperCase(ch);// for character to upper case we use Character.toUpperCase()
        
        // THIS IS USED FOR STRING ONLY ch=ch.toUpperCase();
        
       
        if(ch=='A'|| ch=='E' || ch=='I' ||ch== 'O'|| ch=='U'){
            System.out.println("It is a vowel");
        }
        else if(Character.isDigit(ch)){
            System.out.println("ERROR");
        }
        //else if (Character.isLetter(cond)){
            //System.out.println("");
        //}
        else if(ch=='@'|| ch=='#'|| ch=='%' || ch=='*'|| ch=='^'|| ch=='?'|| ch=='>'){
                System.out.println("ERROR");
        }
        else{
            System.out.println("it is a consunant");
        }
        
              
    }    
}
    

