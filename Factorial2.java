import java.util.Scanner;

public class Factorial2 {
    public static void main(String argus[]){
        int fact=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("rong number enter");
        }else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
                System.out.println(fact);
            }
        }
    }
}
