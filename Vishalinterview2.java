import java.util.Scanner;

public class Vishalinterview2 {
    public static void main(String argus[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   int a=0,b=1; int sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
          
        
        System.out.println(sum);
        }
    }
}
