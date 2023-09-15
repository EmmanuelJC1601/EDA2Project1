public class Bubble{
    public static void BubbleSort(int arr[]){
        int i;
        int j;
        int n=arr.length-1;
        for(i=n;i>=0;i--){
            for(j=0;j<i;j++){
                if(arr[j]>arr[j+1])
                    Utilerias.swap(arr,j,j+1);
            }
        }
    }
}