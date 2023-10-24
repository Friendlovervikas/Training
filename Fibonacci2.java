import java.util.Scanner;

public class Fibonacci2{
    static int fib(int N){
        if(N<=1)
            return N;
        return fib(N-1)+fib(N-2);
    }
    public static void main(String argus[]){
        System.out.println("Enter the Number:-");
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("the number are");
        for(int i=0;i<N;i++){
            System.out.println(" "+fib(i));
        }
    }
}
