/*FIND THE BUG IN THIS CODE AND FIX IT
public class Main {
    public static void main(String[] args) {
        String s = null;
        if (s.equals("test")) {
            System.out.println("Match found");
        }
    }
}*/


public class findingbug {
    public static void main(String[] arg){
        //String s = null; HERE " " bug is null key word if the string s is void there cant be
        // performed any operation so remove null of insert it between double quotes " "
        String s = "null";
        if (s.equals("test")) {
            System.out.println("Match found");
        }else{
            System.out.println("match not found");
        }

    }
    
}
