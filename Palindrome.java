import java.util.Scanner;

public class Palindrome {
    public static void main(String argus[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0, temp=0;
        temp=n;
        while(n>0){
        sum=(sum*10)+n%10;
        n=n/10;
        }
        if(temp==sum){
            System.out.println("its is palindrome number");
        }else{
            System.out.println("its is not palindrome number");
        }

    }
}
