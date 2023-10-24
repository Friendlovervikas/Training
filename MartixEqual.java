public class MartixEqual {
    public static void main(String []argus){
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int row1,row2,col1,col2;
         row1=a.length;
    col1=a[0].length;
    row2=b.length;
    col2=b[0].length;
        boolean flag = true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]!=b[i][j]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("martix is equal");
        }else{
            System.out.println("Martix is not equal");
        }
    if(row1!=row2 || col1!=col2){
        System.out.println("Martix is not equal");
    }
    }
}
