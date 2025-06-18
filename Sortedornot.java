import java.lang.annotation.ElementType;

public class Sortedornot{
    public static void main(String[] args) {
        int[] marks={23,45,67,67,68,98};
        int asscending=1;
        int descending=1;
       for(int i=0;i<marks.length-1;i++){
        if(marks[i]>marks[i+1]){
            asscending=0;
            
        }
        if(marks[i]<marks[i+1]){
            descending=0;
            
           }
        }
        if(asscending==1){
        System.out.println("ARRAY ID SORTED IN ASSCENDING ORDER");
        }
        else if(descending==1){
        System.out.println("ARRAY IS SORTED IN DESCENDING ORDER");
       }
    else{
        System.out.println("ARRAY IS NOT SORTED");
    }
    }
}