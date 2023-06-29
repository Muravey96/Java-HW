import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] book = {"Иванов 123", "Иванов 345", "Петров 572", "Сидоров 7891"};
        HashMap<String,List<Integer>> map = PhoneBook.Task.phoneFill(book);
        PhoneBook.Task.printHashMap(map);
    }
}
