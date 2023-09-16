public class Merge{

    public static long contM;

    public static long merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        int L[] = new int [n1]; 
        int R[] = new int [n2];
        //long contM=4L; 
        contM=4;
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
            contM++;
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
  
    public static long sort(int arr[], int l, int r) { 
        //long contM=0L;
        contM=0L;
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