public class Multiplicar {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 1, 5, 100, 9, 10};
    int mult = 1;

    for(int a : arr) mult *= a;

    int mult2 = multiplicacion(arr, 0, arr.length - 1);

    System.out.println("Iterativo: " + mult);
    System.out.println("Divide and conquer: " + mult2);
  }

  public static int multiplicacion(int[] arr, int begin, int end){
    if(begin == end) return arr[begin];
    else if(begin > end) return 1;

    int mid = (end + begin) / 2;

    int left = multiplicacion(arr, begin, mid);
    int right = multiplicacion(arr, mid + 1, end);

    return left * right;
  }
}
