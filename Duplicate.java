import java.util.Scanner;

public class Duplicate{
    static int duplicate(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                 return arr[i];
                }
            }
        }
      return -1;
      } 
    public static void main(String []argus){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enetr the element of array");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the duplicate element are "+ duplicate(arr));
    }
}
