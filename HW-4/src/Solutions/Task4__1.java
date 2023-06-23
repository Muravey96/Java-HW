// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Solutions;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Task4__1 {
    
// Задаем список (загатовка или рандомно) и команды печати исходного и нового списков
    public static void main(String[] args){ 
        
        LinkedList<Integer> list = new LinkedList<>();
        // Collections.addAll(list, 6, 14, 26, 58, -5, 48, 74, 6, 87, 35, 3, 94);
        Random rnd = new Random();
        for(int i = 0; i<10; i++){
           list.add(rnd.nextInt(100));
        }
        System.out.println(list);
        System.out.println(reversed(list));
    }
// Метод для перезаписи списка в обратном порядке
    private static LinkedList<Integer> reversed(LinkedList<Integer> list) {
        LinkedList<Integer> newlist = new LinkedList<>(); //Новый пустой список, куда будем перезаписывать 
        for (int i = list.size() -1; i >= 0 ; i--) {
            newlist.add(list.get(i));
        }
        return newlist;
    }
}
