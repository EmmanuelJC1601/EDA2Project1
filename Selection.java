public class Selection {  
   
    public static long selectionSort(int[] arr){  

        long contS=3L;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
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