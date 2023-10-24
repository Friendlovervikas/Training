public class Bubble {
    public static void main(String argus[]){
        int []arr={2,4,5,6,3,43,3};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<(arr.length-i);j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
                System.out.print(arr[i]+" ");
        }
    }
}
