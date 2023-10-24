import java.util.Scanner;

public class Fibonacci{
    static void Fibonacci(int N){
        int a=0;int b=1; int sum=0; int count=2;
         System.out.println("The number are ");
        while(count < N){
           
         System.out.println(a+ "");
         sum=a+b;
         a=b;
         b=sum;
         count ++;
        }
    }
    public static void main(String[] argus){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        Fibonacci(N);
    }

}

    
