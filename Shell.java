public class Shell{
    public static long shellSort(int arr[]){
        long cnt=0L;
        for (int incr = arr.length/2; incr>0; incr/= 2 ){
            for (int i = incr ; i < arr.length ; i++ ){
                int j = i - incr;
                cnt++;
                while (j >= 0){
                    if (arr[j] > arr[j + incr]){
                        cnt+=Utilerias.swap(arr,j,(j+incr));
                        j-=incr;
                        cnt++;
                    }
                    else{
                        j-=1;
                        cnt++;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }
}