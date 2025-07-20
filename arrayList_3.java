import java.util.ArrayList;
import java.util.Arrays;
public class arrayList_3 {
    public static void main(String[] args) {
         ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        //  Create a new int array of the same size
        int[] numberArray = new int[numberList.size()];

        //  Copy elements from ArrayList to array 
        for (int i = 0; i < numberList.size(); i++) {
            numberArray[i] = numberList.get(i);
        }
        System.out.println("your array is");
        System.out.println(Arrays.toString(numberArray));

       
    }
    
}
