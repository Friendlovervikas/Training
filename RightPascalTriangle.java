import java.util.Scanner;

public class RightPascalTriangle {
    public static void main(String argus[]){
        System.out.println("Enter the number of row ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=row;i>-1;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
