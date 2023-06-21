// Пусть дан произвольный список целых чисел, удалить из него четные числа


package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Task2 {
    static Random random = new Random();
    public static void filler(){
        List<Integer> iList = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i<100; i++){
           iList.add(rnd.nextInt(100));
        }
        System.out.println(iList);

// Var.1
        // ArrayList<Integer> delList = new ArrayList<>();
        // for(Integer num: iList){
        //     if(num%2 == 0) delList.add(num);
        // }
        // iList.removeAll(delList);
        // System.out.println(iList);

// Var.2 
        Iterator<Integer> delList = iList.iterator();
        while (delList.hasNext()) {
            if ((delList.next()) % 2 == 0) {
                delList.remove();
            }
        }
        System.out.println(iList);
    }   

}
