/*Write a java program that takes a grade letter from the user 
(A, B, C, D, or F) and prints the corresponding GPA value */
import java.util.Scanner;
public class switch_2_case {
    public static void main(String[] arg){
        System.out.println("enter your grade obtained among (A,B,C,D,F)");
        Scanner inputs = new Scanner(System.in);
        int gpa;
        String grade=inputs.nextLine();
        grade=grade.toUpperCase();

        switch (grade) {
            case "A":
               gpa=4;
               break;
            case "B":
               gpa=3;
               break;  
            case "C":
               gpa=2;
               break;
            case "D":
               gpa=1;
               break;
            case "F":
               gpa=0;
               break;
            default:
                gpa=-1;
                break;

        }
        if (gpa==-1){
            System.out.println("invalid grade dear");
        }
        else{
            System.out.println("your GPA VALUE IS "+gpa);
        }


    }
    
}
