/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento ShellSort
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class Shell{
/**
 * Este método de tipo long ordena por medio del algoritmo ShellSort
 * un arrego recibido y regresa el número de operaciones necesarias 
 * para realizar el ordenamiento.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo que va a ordenar
 * @return número de operaciones realizadas
 */
    public static long shellSort(int arr[]){
        long cnt=0L;
        for (int incr = arr.length/2; incr>0; incr/= 2 ){
            for (int i = incr ; i < arr.length ; i++ ){
                int j = i - incr;
                cnt++;
                while (j >= 0){
                    if (arr[j] > arr[j + incr]){
                        cnt+=Utilerias.swap(arr,j,(j+incr));
                        j-=incr;
                        cnt++;
                    }
                    else{
                        j-=1;
                        cnt++;
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }
}