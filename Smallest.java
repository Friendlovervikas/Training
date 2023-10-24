import java.util.Scanner;
public class Smallest {
 static void min(int arr[]){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
            System.out.println("smallest element of array" + min);
        }
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of any array");
    int n=sc.nextInt();
  System.out.println("enter the ellment of array ");
  int arr[]=new int[n];
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
    min(arr);
    }
}




