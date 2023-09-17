/**
 * Esta clase realiza la implementación de las operaciones necesarias en
 * las demás clases
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 * 
 * Last modification: 17-09-2023
 */

import java.util.Random;

public class Utilerias {
/**
 * Este método de tipo void rellena un arreglo recibido hasta
 * el tamaño indicado utilizando valores aleatorios
 * 
 * @author Ruiz Cervantes Karla Patricia
 * @param arr[] arreglo que va a llenar
 * @param size tamaño del arreglo a llenar
 */
    public static void llenar(int array[], int size){
        Random random = new Random();
        for(int i=0;i<size;i++)
            array[i]= random.nextInt(10001);
        System.out.println("\n--- Arreglo generado exit\u00f3samente ---");
    }

/**
 * Este método de tipo void realiza la impresión del contenido
 * de un arreglo que recibe.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo que va a imprimir
 */
    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

/**
 * Este método de tipo void realiza la impresión del contenido
 * de un arreglo que recibe.
 * 
 * @author Jiménez Córdova Emmanuel
 * @param arr[] arreglo del que va a cambiar
 * @param i primera posición a cambiar
 * @param j segunda posición a cambiar
 * @return numero de operaciones realizadas
 */
    public static int swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return 3;
    }
}
