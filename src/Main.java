public class Main {
  public static void main(String[] args) {
    int[] array = new int[] {0, 15, 17, 2, 9, 4};

    bubbleSort(array);
    print(array);
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == array.length-1) {
        System.out.print(array[i]);
      }
      else {
        System.out.print(array[i] + ", ");
      }
    }
  }

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length -1; i++) {
      for (int j = 0; j < array.length -1 -i; j++) {
        if (array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
  }
}