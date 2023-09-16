public class Quick{

    private static long operationCount = 0;

    public static int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int i = (low-1);
    for (int j=low; j<high; j++){
        if (arr[j] <= pivot)
        {
            i++;
            Utilerias.swap(arr, i,j);
            operationCount++;

        }
    }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        operationCount++;
        return i+1;
    }

    public static long QuickSort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
        return operationCount;
    }
}