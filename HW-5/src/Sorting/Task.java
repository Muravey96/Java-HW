package Sorting;


public class Task {
    public static void heapSort(int[] myArray, int length) {
      int temp;
      int size = length-1;
      for (int i = (length / 2); i >= 0; i--) { // Построение кучи (перегруппируем массив)
         heapify(myArray, i, size);
      };
      for(int i= size; i>=0; i--) { // один за другим извлекаем элементы из кучи
        // Перемещаем текущий корень в конец через временную переменную 
        temp = myArray[0];
         myArray[0] = myArray[size];
         myArray[size] = temp;
         size--;
         // Вызываем метод heapify на уменьшенной куче
         heapify(myArray, 0, size);
      }
   }
// Метод для преобразования в двоичную кучу поддерева с корневым узлом i, что является индексом в arr[]. n - размер кучи
   public static void heapify (int [] myArray, int i, int heapSize) {
      int a = 2*i; // Левый
      int b = 2*i+1; // Правый
      int largestElement; // Инициализируем наибольший элемент как корень
      // Если левый дочерний элемент больше корня, записываем его в наибольший
      if (a<= heapSize && myArray[a] > myArray[i]) {
         largestElement = a;
      }
         else {
         largestElement = i;
      }  // Если нет, значит записываем правый дочерний элемент  в наибольший
      if (b <= heapSize && myArray[b] > myArray[largestElement]) {
         largestElement = b;
      } // Случай если корень - не самый большой элемент
      if (largestElement != i) {
         int temp = myArray[i];
         myArray[i] = myArray[largestElement];
         myArray[largestElement] = temp;
         // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
         heapify(myArray, largestElement, heapSize);
     }
   }
// Вывод массива
  public static void printArray(int arr[]){
    int n = arr.length;
    for (int i = 0; i<n; i++){
        System.out.println(arr[i] + " ");
    }
    System.out.println();
  }
}
