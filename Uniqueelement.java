import java.util.Scanner;

public class Uniqueelement {
    static int uniqueelement(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i]; 
             }
        }
    return ans;
    }
    public static void main(String []argus){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the unqueelement "+uniqueelement(arr));
        
    }
}
