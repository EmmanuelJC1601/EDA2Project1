import java.util.Scanner;
import java.util.Random;

public class Principal {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int opcion;
        int operaciones;
        
        System.out.println("\t------Bienvenido-----\n"
        +"Se llenar\u00e1 un arreglo del tama\u00f1o dado con valores aleatorios.");
        System.out.print("Ingresa el tama\u00f1o del arreglo: ");
        int size=input.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]= random.nextInt(10001);
        }
        //System.out.println("Contenido Arreglo.");
        //Utilerias.printArray(array);
        do{
            System.out.println("Que quiere realizar?\n"
            +"\t1.Llenar un nuevo arreglo con valores aleatorios.\n"
            +"\t2.Usar InsertionSort.\n\t3.Usar SelectionSort.\n"
            +"\t4.Usar BubbleSort.\n\t5.Usar QuickSort.\n\t6.Usar HeapSort.\n"
            +"\t7.Usar MergeSort.\n\t8.Usar otro.\n\t9.Salir.");
            opcion=input.nextInt();

            switch(opcion){
                case 1:
                    for(int i=0;i<size;i++){
                        array[i]= random.nextInt(10001);
                    }
                    System.out.println("Nuevo Arreglo Creado.");
                    //Utilerias.printArray(array);
                    break;
                case 2:
                    System.out.println("Operaciones realizadas: "+Insertion.insertionSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 3:
                    System.out.println("Operaciones realizadas: "+Selection.selectionSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 4:
                    System.out.println("Operaciones realizadas: "+Bubble.BubbleSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 5:
                    System.out.println("Operaciones realizadas: "+Quick.QuickSort(array, 0, array.length-1));
                    //Quick.QuickSort(array, 0, array.length-1);
                    //System.out.println("Número total de operaciones: " + Quick.operationCount);
                    System.out.println("Arreglo ordenado: ");
                    Utilerias.printArray(array);
                    break;
                case 6:
                    System.out.println("Operaciones realizadas: "+Heap.HeapSort(array,array.length));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 7:
                    //System.out.println("Operaciones realizadas: "+Merge.sort(array,0,array.length-1));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 8:
                    System.out.println("Operaciones realizadas: ");
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        }while(opcion!=9);
    }  
}