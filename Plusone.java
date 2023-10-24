import java.util.Arrays;

public class Plusone{
    public static int[] plusone(int[] digits){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            }
            int [] newnumber=new int[n+1];
            newnumber[0]=1;
            return newnumber;
        }
public static void main(String args[])   
{  
int [] arr = {9, 3, 8, 9};   
int[]ans=plusone(arr);    
System.out.println(Arrays.toString(ans));  
}  
}  