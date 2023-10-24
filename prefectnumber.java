import java.util.*;  
public class prefectnumber{
    public static void main (String[]argus){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        int show=0;
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
           show=a+b;
           a=b;
           b=show;
             System.out.print(" " +show);          
        }
    }
}