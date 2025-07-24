public class checkEquality {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 8, 11};
        int[] array2 = {2, 5, 7, 8, 11};
        int len=array1.length;
        for(int i =0;i<len;i++){
            if(array1[i]==array2[i]){
                if(i==len-1){
                    System.out.println("arrays are equal");
                }
                continue;
            }
            
            else{
                System.out.println("arrays ae not equal");
                break;
            }
        }
    }
    
}
