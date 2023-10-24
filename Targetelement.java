import java.util.Scanner;

public class Targetelement {
    static int targetelement(int arr[], int taget){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==taget){
                    ans++;
                }
            }
        }
    return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the element of array");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the tagret element");
        int taget=sc.nextInt();
        System.out.println("the target element are "+targetelement(arr,taget));
        
    }
}
