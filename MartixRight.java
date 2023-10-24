public class MartixRight{
    public static void main(String []argus){
        int row,col;
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
            row=a.length;
            col=a[0].length;
            if(row!=col){
                System.out.println("martix is not equal");
            }
            else{
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<a[0].length;j++){
                        if(j>i){
                            System.out.print(0+" ");
                        }
                        else{
                           System.out.print(a[i][j]+" ");
                        }
                        
                    }
                    System.out.println();
                }
            }

        }
 }