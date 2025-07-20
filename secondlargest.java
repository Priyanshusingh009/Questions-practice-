import java.util.Arrays;
public class secondlargest {
    public static void main(String[] args){
        int[] my_array ={ 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        Arrays.sort(my_array);
        int length=my_array.length;
        System.out.println("second largest no is "+my_array[length- 2]);
        
            
        }

    //     int largest=0;                  
    //     for(int i=1;i<my_array.length;i++){
    //         if(my_array[i]>my_array[i-1]){
    //             my_array[i-1]=my_array[i];
    //         }
    //         else{
    //             my_array[i]=my_array[i-1];
    //         }
    //     }
    //     System.out.println(my_array[2]);
    // }
      
    
    }
}
