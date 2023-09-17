/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento BubbleSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Bubble{
/**
 * Este método de tipo long ordena por medio del algoritmo BubbleSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo que va a ordenar
 * @return número de operaciones realizadas
 */

    public static long BubbleSort(int arr[]){
        long cnt=0L;
        int i;
        int j;
        int n=arr.length-1;
        cnt+=3;
        for(i=n;i>=0;i--){
            for(j=0;j<i;j++){
                if(arr[j]>arr[j+1])
                    cnt+=Utilerias.swap(arr,j,j+1);
                cnt++;
            }
        }
        return cnt;
    }
}