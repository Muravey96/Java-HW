import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    // Задание 1    
        String[] book = {"Иванов 123", "Иванов 345", "Петров 572", "Сидоров 7891"};
        HashMap<String,List<Integer>> map = PhoneBook.Task.phoneFill(book);
        PhoneBook.Task.printHashMap(map);

    // Задание 2

        int arr[] = {1, 12, 15, 6, 10};
        int n = arr.length;
        Sorting.Task.heapSort(arr, n);
        Sorting.Task.printArray(arr);
        
    }
}
