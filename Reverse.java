import java.util.Scanner;

public class Reverse {
   public static void main(String []argus){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
      System.out.println("Enter element of array");
    int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( "The original array:");
    for(int i=0;i<arr.length;i++){
         System.out.print(+arr[i]+" ");
    }
    System.out.println("The reverse array ");
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(+arr[i]+" ");
    }
    }
}
