public class Bubblefunction { 
    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};                                 
int n = arr.length;   
for(int i=0; i < n; i++){  
for(int j=1; j < (n-i); j++){  
if(arr[j-1] > arr[j]){                            
int temp = arr[j-1];  
arr[j-1] = arr[j];  
arr[j] = temp;  
}       
}
 System.out.print(arr[i] + " ");    
}  
}  
   }  