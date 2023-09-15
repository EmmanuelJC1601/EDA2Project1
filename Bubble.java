public class Bubble{
    public static long BubbleSort(int arr[]){
        long cnt=0L;
        int i;
        int j;
        int n=arr.length-1;
        cnt+=3;
        for(i=n;i>=0;i--){
            for(j=0;j<i;j++){
                if(arr[j]>arr[j+1])
                    cnt+=Utilerias.swap(arr,j,j+1);
                cnt++;
            }
        }
        return cnt;
    }
}