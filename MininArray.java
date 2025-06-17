public class MininArray {
    public static void main(String[] args) {
        int[] marks={5,67,890,68,25,54,66,55,34};
        int pre1=marks[0];
        for(int i :marks){
            if(i>=pre1){
                pre1=pre1;
        
            }
            else{
                pre1=i;
            }
        }
        System.out.println(pre1 + " is minimum");
    }
}
       
        

            
        
    
    

