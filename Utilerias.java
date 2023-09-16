import java.util.Random;

public class Utilerias {

    public static void llenar(int array[], int size){
        Random random = new Random();
        for(int i=0;i<size;i++)
            array[i]= random.nextInt(10001);
        System.out.println("\n--- Arreglo generado exitósamente ---");
    }
    
    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static int swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return 3;
    }
}
