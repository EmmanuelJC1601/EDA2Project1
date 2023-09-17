/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento MergeSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Merge{
/**
 * Este método de tipo long ordena  un arrego recibido por medio de 
 * intercalación con el algoritmo MergeSort y regresa el número de 
 * operaciones necesarias para realizar el ordenamiento.
 * 
 * @author Meneses Calderas Grecia Irais
 * @param arr[] arreglo que va a ordenar
 * @param l índice inicial de la parte del arreglo a ordenar
 * @param m índice medio de la parte del arreglo a ordenar
 * @param r índice final de la parte del arreglo a ordenar
 * @return número de operaciones realizadas
 */

    public static long merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        int L[] = new int [n1]; 
        int R[] = new int [n2];
        long contM=4L; 

        for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i]; 
            contM++;
        }

        for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1+ j]; 
            contM++;
        }
  
        int i = 0, j = 0; 
        int k = l; 
        contM+=3;

        while (i < n1 && j < n2) 
        { 
            contM+=2;
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
                contM+=2;
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
                contM+=2;
            } 
            k++; 
        } 
  
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
            contM+=3;
        } 
  
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
            contM+=3;
        } 
        return contM;

    } 

/**
 * Este método de tipo long indica la división y regresa el número de 
 * operaciones necesarias para realizar el ordenamiento.
 * 
 * @author Meneses Calderas Grecia Irais
 * @param arr[] arreglo que va a ordenar
 * @param l índice inicial del arreglo a ordenar
 * @param r índice final del arreglo a ordenar
 * @return número de operaciones realizadas
 */
    public static long sort(int arr[], int l, int r) { 
        long contM=0L;
        if (l < r) { 
            int m = (l+r)/2; 
            contM++;
            contM+=sort(arr, l, m); 
            contM+=sort(arr , m+1, r); 
  
            contM+=merge(arr, l, m, r); 
        }
        
        return contM;
    }

}