class Employe{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("user id is "+ id);
        System.out.println("user name is "+ name);
        System.out.println("user salary is "+ salary);
}

    public int getsalary(){
        return salary;

        
    }


}

public class oopscustomclass{
    public static void main(String[] args) {
        System.out.println("this is our costom class");
        Employe ps= new Employe();
        //setting atributes for ps
        ps.id=10;
        ps.name="priyanshu singh";
        ps.salary=500000;
        ps.printdetails();
        //ps.salary=400000;
        int salary=ps.getsalary();
        System.out.println(salary);


        
        
        
    }
    
}
