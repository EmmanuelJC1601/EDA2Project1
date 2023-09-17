public class BubbleVer {
    public static long BubbleSortVer(int arr[]){
        long cnt=0L;
        int i;
        int j;
        int n=arr.length-1;
        boolean ver= false;
        cnt+=3;
        for(i=n;i>=0;i--){
            ver = false;
            for(j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    ver = true;
                    cnt+=Utilerias.swap(arr,j,j+1);
                }
                cnt++;
            }
            if(ver == false){
                break;
            }
        }
        return cnt;
    }
}
