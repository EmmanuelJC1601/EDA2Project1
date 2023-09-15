public class Heap{

    static int heapSize;

    public static int Heapify(int arr[],int i,int size){

        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        int cnt=3;

        if(l <= heapSize && arr[l] > arr[i]){
            largest = l;
            cnt+=2;
        }
        else{
            largest = i;
            cnt++;
        }
        if(r <= heapSize && arr[r] > arr[largest]){
            largest = r;
            cnt+=2;
        }
        if(largest != i){
            cnt+=Utilerias.swap(arr,i,largest);
            cnt+=Heapify(arr, largest,size);
            cnt++;
        }
        return cnt;
    }
    
    public static int BuildHeap(int arr[],int size){
        heapSize = size - 1;
        int i;
        int cnt=2;
        for(i = (size - 1) / 2; i >= 0; i--){
            cnt+=Heapify(arr, i,size);
        }
        return cnt;
    }
    
    public static int HeapSort(int arr[],int size){
        int cnt=BuildHeap(arr,size);
        int i;
        cnt++;
        for(i=size-1;i>0;i--){
            cnt+=Utilerias.swap(arr,0,heapSize);
            heapSize--;
            cnt+=Heapify(arr,0,size);
            cnt++;
        }
        return cnt;
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