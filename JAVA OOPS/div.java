import java.util.*;
public class div {
    public static int divide(int x, int y) throws DivisionException{
        if(y == 3){
            throw new DivisionException();
        }
        return x/y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = divide(a, b);
            System.out.println(c);
        }
        catch(DivisionException e){
            System.out.println(e);
        }
    }
}

class DivisionException extends Exception{
    public String toString(){
        return "Division by 3 is not allowed";
    }
}
