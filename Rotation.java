import java.util.Scanner;

public class Rotation {
   public static void main(String argus[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    System.out.println("Enter the element of array");
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Orginal array");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    int key=3;
    int last;
    for(int i=0;i<key;i++){
       last=arr[arr.length-1];
       for(int j=arr.length-1;j>0;j--){
        arr[j]=arr[j-1];
       }
        arr[0]=last;
       
    }
       System.out.println();
       System.out.println("after the rotating");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
   }
