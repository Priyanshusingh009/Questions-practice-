import java.util.Arrays;
public class commonelements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL","JAVA", "SQLite","JAVA", "Oracle", "PostgreSQL", "DB2", "JAVA"};
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