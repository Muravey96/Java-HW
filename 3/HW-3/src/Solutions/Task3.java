// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    static Random random = new Random();
    public static void selector(){
        List<Integer> iList = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i<10; i++){
           iList.add(rnd.nextInt(100));
        }
        System.out.println(iList);

        int min = iList.get(0);
        int max = min;
        double sum = 0;
        for (int i = 0; i < iList.size(); i++) {
            sum += iList.get(i);
            if (iList.get(i) > max) {
                max = iList.get(i);
            } else if (iList.get(i) < min) {
                min = iList.get(i);

            }
        }
        System.out.printf("minimum : %d ,maximum : %d, mean : %.2f", min, max, sum / iList.size());
    }
}
