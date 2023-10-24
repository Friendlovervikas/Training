import java.util.Scanner;

public class Copyofarray {
    public static void main(String argus[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n=sc.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            array2[i]=array1[i];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(array2[i]);
            
        }       
}
}
