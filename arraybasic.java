public class arraybasic {
                                                     
    public static void main(String[] arg){
       int[] marks=new int[5];
       marks[0]=45;
       marks[4]=78;
       System.out.println(marks[0]);
       //now if we again put another value on same intex old one gets updated 
       marks[0]=99;
       System.out.println(marks[0]);// it will give 99
       //method 2  to make array first declartion then memory allocation
       int[] marks2;// declaration
       marks=new int[5];// memory allocted
       // method 3 direction allocation 
       int[] marks3={45,67,56,89};
       // now i have to accessing its 4 element
       System.out.println(marks3[3]);// i write index 3 here because array indexing 
       //starts from 0 so for 4th element index is 3 


    }
    
}

    

