package PhoneBook;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task{
    // Метод заполнения
    public static HashMap<String,List<Integer>> phoneFill(String[] phoneNum){
        HashMap<String,List<Integer>> outMap = new HashMap<>();
        for(String s: phoneNum){
           String[] sPhone = s.split(" ");// Указываем разделитель (пробел) между именем и номером
           // Если попадается новый человек и номер, мы добавляем оба, но если человек повторяется, мы добавляем только его доп номер
           if(!outMap.containsKey(sPhone[0])){// sPhone[0] - на этой позиции находится ключ
            // ! -  для случая если такого человека еще нет и его необходимо добавить.
            List<Integer> phoneList = new ArrayList<>(); // Задаем новый пустой список для номеров
            phoneList.add(Integer.parseInt(sPhone[1])); // Заполняем список номерами
            outMap.put(sPhone[0], phoneList); //Записываем из нашего списка номеров в список с менами
            }
            else{ // Обрабатываем случай, когда человек уже есть в списке
                outMap.get(sPhone[0]).add(Integer.parseInt(sPhone[1]));
            }
        }
        return outMap;
    }
    // Метод печати
    public static void printHashMap(HashMap<String,List<Integer>> outMap){
        for(Map.Entry<String,List<Integer>> item: outMap.entrySet()){
            System.out.println(item.getValue()+" - "+item.getKey());
        }
    }
}