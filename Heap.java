public class Heap{

    static int heapSize;

    public static void Heapify(int arr[],int i,int size){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if(l <= heapSize && arr[l] > arr[i])
            largest = l;
        else
            largest = i;
        if(r <= heapSize && arr[r] > arr[largest])
            largest = r;

        if(largest != i){
            Utilerias.swap(arr,i,largest);
            Heapify(arr, largest,size);
        }
    }
    
    public static void BuildHeap(int arr[],int size){
        heapSize = size - 1;
        int i;
        for(i = (size - 1) / 2; i >= 0; i--){
            Heapify(arr, i,size);
        }
    }
    
    public static void HeapSort(int arr[],int size){
        BuildHeap(arr,size);
        int i;
        for(i=size-1;i>0;i--){
            Utilerias.swap(arr,0,heapSize);
            heapSize--;
            Heapify(arr,0,size);
        }
    }
}

/*
void HeapSort(int* A, int size){
	BuildHeap(A,size);
  	int i;
  	for(i = size - 1; i > 0; i--){
    	swap(&A[0],&A[heapSize]);      
      	heapSize--;
      	printf("Iteracion HS: \n");
  		printArray(A,size);
		Heapify(A, 0,size);
   }
}

int heapSize;

void Heapify(int* A, int i, int size)
{
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	int largest;

	if(l <= heapSize && A[l] > A[i])
    	largest = l;
  	else
    	largest = i;
  	if(r <= heapSize && A[r] > A[largest])
    	largest = r;
  	if(largest != i){
    	swap(&A[i],&A[largest]);
    	printArray(A,size);
    	Heapify(A, largest,size);
     }
      
}

void BuildHeap(int* A, int size){
	heapSize = size - 1;
  	int i;
  	for(i = (size - 1) / 2; i >= 0; i--){
		Heapify(A, i,size);
  	}
	printf("Termin%c de construir el HEAP \n",162);
}
*/