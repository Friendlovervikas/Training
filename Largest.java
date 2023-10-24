import java.util.Scanner;

public class Largest {
    public static void max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                
            }
        }
        System.out.println("The largest element of array" + max);
          
 }
public static void main(String argus[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
System.out.println("Enter the element of array");
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
max(arr);
}
}
