public class CountofarraySameNumber {

    public static void main(String argus[]){
        int[] arr={2,3,4,3,2,3};
        int [] fr=new int [arr.length];
        int visit=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=visit;
                }
            }
                if(arr[i]!=visit);
                fr[i]=count;
            }
            for(int i=0;i<fr.length;i++){
                if(arr[i]!=visit )
                System.out.println(" "+arr[i]+" | "+fr[i]);

            }
            
    }
        }