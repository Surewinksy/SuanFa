public class SuanFaTool {
    //选择排序
    public static void XuanZePX(Integer[] a){
        int b=0;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }
    }
    //
}
