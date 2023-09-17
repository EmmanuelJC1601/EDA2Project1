/**
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 */

public class Bubble{

    /**
     * Este método suma dos números enteros y devuelve el resultado.
     *
     * @param arr es el arreglo que se ordenar
     * @return La suma de num1 y num2.
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