import java.util.Scanner;

public class LeftPascalTriangle {
    public static void main(String argus[]){
        System.out.println("enter the number of row");
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<row;i++){
            for(int j=2*(row-i);j>=0;j--){
                System.out.print(" ");
            }
        for(int j=1;j<=i;j++){
            System.out.print(" "+"*");
        }
        System.out.println();
    }
        for(int i=row;i>0;i--){
            for(int j=2*(row-i);j>=0;j--){
                System.out.print(" ");
            }
        for(int j=1;j<=i;j++){
            System.out.print(" "+"*");
        }
        System.out.println();
    
}
}
}
