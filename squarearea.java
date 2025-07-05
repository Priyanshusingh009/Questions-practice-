class Square  {
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return  4*side;
    }    
}
public class squarearea {
    public static void main(String[] args) {
        Square find=new Square();
        find.side=4;
        System.out.println("AREA IS "+find.area());
        System.out.println("PARAMETER IS "+find.parameter());
    }
    
}
