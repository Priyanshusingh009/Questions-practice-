import java.util.Arrays;
public class pairPrime {
     static void pairs_value(int inputArray[]) {
        System.out.println("Pairs of elements and their sum which is prime no : ");

       
        for (int i = 0; i < inputArray.length; i++) {
           
            for (int j = i + 1; j < inputArray.length; j++) {
                // Check if the sum of inputArray[i] and inputArray[j] equals the prime.
        if ((inputArray[i] + inputArray[j])%2 == 1 && (inputArray[i] + inputArray[j])%3 != 1 && (inputArray[i] + inputArray[j])%3 != 0 && (inputArray[i] + inputArray[j])%5 != 0   && (inputArray[i] + inputArray[j])%7 != 0 ||(inputArray[i] + inputArray[j]) ==2) {
                    
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " +(inputArray[i] + inputArray[j]));
                }
            }
        }
    }
    public static void main(String[] args) {
        pairPrime sum=new pairPrime();
        sum.pairs_value(new int[]{23,9,72,43,65,56,87,90,10,20,15,5});
       // sum.pairs_value(new int[]{2, 7, 4, -5, 11, 5, 20});
        
    }
    
}
