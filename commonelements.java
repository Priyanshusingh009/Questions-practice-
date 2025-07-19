import java.util.Arrays;
public class commonelements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL","JAVA", "SQLite","JAVA", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        
        for(int p =0;p<array1.length;p++){
            int count=0;
            for(int s =0;s<array2.length;s++){
                if(array1[p]==array2[s]){
                    count++;
                }
                
            }
            
            System.out.println(" no of times "+array1[p]+" duplicate is =  "+count);                                                                                                            
        }
        for(int i =0;i<array1.length;i++){
            for(int j =0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println("common element is "+array1[i]);
                    array2[j]=" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
    }
}
    
