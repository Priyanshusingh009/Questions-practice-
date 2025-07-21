import java.util.Arrays;
public class pairSum {
    static void pairs_value(int inputArray[], int inputNumber) {
        System.out.println("Pairs of elements and their sum : ");

       
        for (int i = 0; i < inputArray.length; i++) {
           
            for (int j = i + 1; j < inputArray.length; j++) {
                // Check if the sum of inputArray[i] and inputArray[j] equals the inputNumber.
                if (inputArray[i] + inputArray[j] == inputNumber) {
                   
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                }
            }
        }
    }
    public static void main(String[] args) {
        pairSum give=new pairSum();
        give.pairs_value(new int[]{23,43,65,56,87,90,10,20,15,5}, 30);
        give.pairs_value(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);
        
    }
}
