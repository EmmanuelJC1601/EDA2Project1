/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento HeapSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */


public class Heap{

    static int heapSize;

/**
 * Este método de tipo long verifica que la estrucutra Heap mantenga su integridad
 * y regresa el número de operaciones necesarias para realizar el ordenamiento.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo que va a ordenar
 * @param i índice nodo padre
 * @param size tamaño del heap/arreglo
 * @return número de operaciones realizadas
 */

    public static long Heapify(int arr[],int i,int size){

        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        long cnt=3L;

        if(l <= heapSize && arr[l] > arr[i]){
            largest = l;
            cnt+=2;
        }
        else{
            largest = i;
            cnt++;
        }
        if(r <= heapSize && arr[r] > arr[largest]){
            largest = r;
            cnt+=2;
        }
        if(largest != i){
            cnt+=Utilerias.swap(arr,i,largest);
            cnt+=Heapify(arr, largest,size);
            cnt++;
        }
        return cnt;
    }
/**
 * Este método de tipo long crea el primer Heap de un arreglo dado
 * y regresa el número de operaciones necesarias para realizar el ordenamiento.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo que va a ordenar
 * @param size tamaño del heap/arreglo
 * @return número de operaciones realizadas
 */
    public static long BuildHeap(int arr[],int size){
        heapSize = size - 1;
        int i;
        long cnt=2L;
        for(i = (size - 1) / 2; i >= 0; i--){
            cnt+=Heapify(arr, i,size);
        }
        return cnt;
    }
/**
 * Este método de tipo long ordena por medio del algoritmo HeapSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Meneses Calderas Grecia Irais
 * @param array[] arreglo que va a ordenar
 * @param size tamaño del heap/arreglo
 * @return número de operaciones realizadas
 */

    public static long HeapSort(int arr[],int size){
        long cnt=BuildHeap(arr,size);
        int i;
        cnt++;
        for(i=size-1;i>0;i--){
            cnt+=Utilerias.swap(arr,0,heapSize);
            heapSize--;
            cnt+=Heapify(arr,0,size);
            cnt++;
        }
        return cnt;
    }
}