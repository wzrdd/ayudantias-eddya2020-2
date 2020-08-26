import java.util.Scanner;

/*
 Enunciado: Ordenar un arreglo usando BubbleSort (Ordenamiento burbuja).
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 5, 4, 7, 13};

        System.out.println("Unsorted: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        bubblesort(arr);

        System.out.println("Sorted: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void bubblesort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
