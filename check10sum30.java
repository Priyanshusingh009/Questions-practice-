public class check10sum30 {
    /*Write a Java program to check if the sum of all the 10's in the array is exactly 30.
     Return false if the condition does not satisfy, otherwise true. */
    public static void main(String[] args) {
        int[] array={10,20,10,10,5, };
        int sum =0;
      
        for(int i=0;i<array.length;i++){
            if(array[i]==10 ){
                sum+=array[i];
                
            }
            else{
                continue;
            }
        }
        if(sum==30){
            System.out.println("The sum of all tens in this array is : "+sum);
            
        }
        else{
        System.out.println("sum is not 30 ---->sum is ="+sum);
        }
    }
    
}
