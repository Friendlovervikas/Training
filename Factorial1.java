import java.util.Scanner;

public class Factorial1 {
    static int fact(int n ){
        if(n==0)
        return 1;
        else
     return n*fact(n-1);
    }
    public static void main(String argus[]){
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int facto=1;
           facto=fact(n);
           System.out.println(facto);

        }
    }
