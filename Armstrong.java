import java.util.Scanner;

public class Armstrong {
    public static void main(String argus[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,digit=0,sum=0;
        int temp=n;
        int mul=1;   
        while(n!=0){ 
         n/=10;
       count=count+1;
    }
        //find the total number of digit
        System.out.println(" the total number of digit  " + count);
       temp=n;
  while(temp!=0){
    digit=temp%10;
    for(int i=0;i<=count;i++){
    mul=mul*digit;
    }
    sum+=mul;
    temp/=10;
  }
if(n==sum)
        System.out.println("its is Armstrong number"); 
      else
      System.out.println("it is not armStrong number");    
 }
}