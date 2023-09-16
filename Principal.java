import java.util.Scanner;
//import java.util.Random;

public class Principal {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        //Random random = new Random();
        int opcion;
        //int operaciones;
        
        System.out.println("\t------Bienvenido-----\n"
        +"Se llenar\u00e1 un arreglo del tama\u00f1o dado con valores aleatorios.");
        System.out.print("\nIngresa el tama\u00f1o del arreglo: ");
        int size=input.nextInt();
        int array[]=new int[size];
    
        //System.out.println("Contenido Arreglo.");
        //Utilerias.printArray(array);
        do{

            Utilerias.llenar(array, size);

            System.out.println("\n\nQue quiere realizar?\n"
            //+"\t1.Llenar un nuevo arreglo con valores aleatorios.\n"
            +"\t1.Usar InsertionSort.\n\t2.Usar SelectionSort.\n"
            +"\t3.Usar BubbleSort.\n\t4.Usar QuickSort.\n\t5.Usar HeapSort.\n"
            +"\t6.Usar MergeSort.\n\t7.Usar otro.\n\t8.Salir.");
            opcion=input.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Operaciones realizadas: "+Insertion.insertionSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 2:
                    System.out.println("Operaciones realizadas: "+Selection.selectionSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 3:
                    System.out.println("Operaciones realizadas: "+Bubble.BubbleSort(array));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 4:
                    System.out.println("Operaciones realizadas: "+Quick.QuickSort(array, 0, array.length-1,0));
                    System.out.println("Arreglo ordenado: ");
                    Utilerias.printArray(array);
                    break;
                case 5:
                    System.out.println("Operaciones realizadas: "+Heap.HeapSort(array,array.length));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 6:
                    System.out.println("Operaciones realizadas: "+Merge.sort(array,0,array.length-1));
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 7:
                    System.out.println("Operaciones realizadas: ");
                    //System.out.println("Arreglo ordenado: ");
                    //Utilerias.printArray(array);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        }while(opcion!=8);
    }  
}