/**
 * 
 * @author Jiménez Córdova Emmanuel
 * @author Meneses Calderas Grecia Irais
 * @author Ruiz Cervantes Karla Patricia
 */

public class Selection {  
   
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