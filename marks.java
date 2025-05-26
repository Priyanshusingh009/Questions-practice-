import java.util.Scanner; 
public class marks {   
    public static void main(String[] args) {
        int inc=0;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total no of subjects");
        int a= sc.nextInt();
        while(inc<a){
            System.out.println("enter your marks out of hundred ");
            int marks= sc.nextInt();
            sum=sum+marks;
            inc++;
        }
        int per=sum*100/(a*100);
        System.out.println("percentage is ::"+per);    
    
        }
}    

        
        // System.out.println("enter your marks in science out of hundred");
        // int b=sc.nextInt();
        // float c=(a+b)*100/200;
        // System.out.println("percentage is = "+ c);
    

