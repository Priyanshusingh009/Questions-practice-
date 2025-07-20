import java.util.ArrayList;
import java.util.Arrays;
public class arrayList_4 {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(10);
        listWithDuplicates.add(20);
        listWithDuplicates.add(10);
        listWithDuplicates.add(30);
        listWithDuplicates.add(20);
        listWithDuplicates.add(40);

        // Create a new ArrayList to store unique values
        ArrayList<Integer> uniqueList = new ArrayList<>();

        //  Add only unique elements
        for (int i = 0; i < listWithDuplicates.size(); i++) {
            int value = listWithDuplicates.get(i);
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }

        //  Convert unique ArrayList to array
        int[] resultArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            resultArray[i] = uniqueList.get(i);
        }

      
        System.out.print("Array without duplicates: ");
        System.out.println(Arrays.toString(resultArray));
        
    }
    
}
