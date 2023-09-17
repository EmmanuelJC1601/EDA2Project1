/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento SelectionSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Selection {  
/**
 * Este método de tipo long ordena por medio del algoritmo SelectionSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Meneses Calderas Grecia Irais
 * @param arr[] arreglo que va a ordenar
 * @return número de operaciones realizadas
 */
    public static long selectionSort(int[] arr){  

        long contS=1L;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
            contS++;
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[min]){  
                    min = j;  
                    contS++;   
                }
                contS++;
            }
            if(i!=min){
                contS+=Utilerias.swap(arr, i,min);
            }

        }  

        return contS;
    }  
}  