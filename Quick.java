public class Quick{

    public static long QuickSort(int arr[], int low, int high){

        long count = 0L;

        if (low < high){

            int pivot = arr[high];
            int i = (low-1);
            count+=2;

            for (int j=low; j<high; j++){
                if (arr[j] <= pivot){
                    i++;
                    count+=Utilerias.swap(arr, i,j);
                    count++;
                }
                count++;
            }

            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            int pi = i + 1;
            count += 4;

            count+= QuickSort(arr, low, pi-1);
            count+= QuickSort(arr, pi+1, high);
        }
        return count;
    }
}