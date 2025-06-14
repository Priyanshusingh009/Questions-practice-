public class averageinarray {
    public static void main(String[] args) {
        int[] marks={45,67,890,68,54,34,66,55};
        float sum=0;
        int length=marks.length;

        for(int i:marks){
            sum+=i;

        }
        System.out.println("average of no.s is "+sum/length);
    }
    
}
