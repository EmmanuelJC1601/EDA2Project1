/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento InsertionSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Insertion{  
/**
 * Este método de tipo long ordena por medio del algoritmo InsertionSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param array[] arreglo que va a ordenar
 * @return número de operaciones realizadas
 */

    public static long insertionSort(int array[]) {  
        int n = array.length;  
        long cnt=1L;
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            cnt+=2;
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
                cnt+=3;
            }  
            array[i+1] = key;  
            cnt++;
        }  
        return cnt;
    } 
}