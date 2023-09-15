public class Insertion{  
    
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
                cnt+=2;
            }  
            array[i+1] = key;  
            cnt++;
        }  
        return cnt;
    } 
}