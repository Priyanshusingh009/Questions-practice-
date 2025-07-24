public class checkEquality {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 8, 11};
        int[] array2 = {2, 5, 7, 8, 11,};
        int len1=array1.length;
        int len2=array2.length;
        if(len1==len2){
            for(int i =0;i<len1;i++){
            if(array1[i]==array2[i]){
                if(i==len1-1){
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
        else{
            System.out.println("arrays are not equal");
        }

        
    }
    
}
