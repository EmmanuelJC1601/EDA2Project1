public class Principal {
    
    public static void main(String args[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22}; 
        int[] arr2 = {10,15,4,3,44,12,59,23}; 

        System.out.println("Arreglos Originales");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        
        Insercion.insertionSort(arr1);
        
        Seleccion seleccion = new Seleccion();   
        seleccion.selectionSort(arr2);  
       
             
        System.out.println("Arreglos ordenados");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        


        //Creando un arreglo de 20 elementos
        int[] array={15,3,6,4,2,7,9,1,14,100,23,57,11,21,70,16,27,48,69,0};
        System.out.print("Arreglo desordenado: ");
        Utilerias.printArray(array);
        System.out.print("Arreglo ordenado con Quicksort: ");
        Quicksort.QuickSort(array, 0, 19);
        Utilerias.printArray(array);
    }  
    
   
}