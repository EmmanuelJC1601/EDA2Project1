/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento QuickSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Quick{
/**
 * Este método de tipo long ordena por medio del algoritmo QuickSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Ruiz Cervantes Karla Patricia
 * @param arr[] arreglo que va a ordenar
 * @param low inicio de donde ordenara
 * @param high hasta donde se ordena
 * @return número de operaciones realizadas
 */
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