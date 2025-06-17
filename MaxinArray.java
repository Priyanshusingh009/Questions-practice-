public class MaxinArray {
    public static void main(String[] args) {
        int[] marks={45,67,890,68,54,34,66,55};
        int flag1=0;
        int flag2=1;
        int length=marks.length-1;
        while(flag1<=length){
            if(marks[flag1]>=marks[flag2]){
                marks[flag2]=marks[flag1];
                flag2++;
                flag1++;
                System.out.println(marks[marks[length]-1]);

            }
            else{
                marks[flag1]=marks[flag2-1];
                flag1++;
                flag2++;
                System.out.println(marks[length]);

            }
        }
        System.out.println(marks[flag2]);

        //else{
            //System.out.println(marks[flag2]);
    }
}
        //System.out.println(marks[flag2]);
        

            
        
    
    

