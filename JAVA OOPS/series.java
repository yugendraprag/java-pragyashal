import java.util.Scanner;

class series{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sum = 0;

        int square = 0; 

        for(int i = 1; i <= n; i++){

            square = square + i * i;
            sum = sum + square;
        }

        System.out.println(sum);

    }
}