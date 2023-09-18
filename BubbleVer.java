/**
 * Esta clase realiza la implementación del algoritmo de ordenamiento BubbleSort
 * pero con la verificación cuando ya está ordenado
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

public class BubbleVer {
/**
 * Este método de tipo long ordena un arrego recibido por medio del algoritmo BubbleSort 
 * optimizado para que pare su ejecución una vez ordenado y regresa el número de 
 * operaciones necesarias para realizar el ordenamiento.
 * 
 * @author Meneses Calderas Grecia Irais
 * @param arr[] arreglo que va a ordenar
 * @return número de operaciones realizadas
 */

    public static long BubbleSortVer(int arr[]){
        long cnt=0L;
        int i;
        int j;
        int n=arr.length-1;
        boolean ver= false;
        cnt+=3;
        for(i=n;i>=0;i--){
            ver = false;
            for(j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    ver = true;
                    cnt+=Utilerias.swap(arr,j,j+1);
                }
                cnt++;
            }
            if(ver == false){
                break;
            }
        }
        return cnt;
    }
}
