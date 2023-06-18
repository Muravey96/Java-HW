import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) throws Exception {
        
        task1();
        task2();
        task3();
    }

// Задача №1 
// 1. Вычислить n-ое число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.printf("Factorial number = %d", factNum(number));
        sc.close();
    }

    public static int factNum(int number) 
    {
        if (number == 0) 
        {return 1;        }
        else 
        {
            return number*factNum(number-1);}
    }



// Задача 2
// 2. Вывести все простые числа от 1 до 1000 

    private static void task2(){
        for (int i = 1; i < 1000; i++) {
            if (simpleNum(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean simpleNum(int num){
        for (int i = 2; i <= num/2; i++) {
        if (num%i ==0) return false;
        }
        return true;
    }

// Задача №3 
//  Реализовать простой калькулятор

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the equation (example - 4.55 + 6.3)\n => ");
        String[] input = sc.nextLine().split(" ");
        sc.close();
        switch (input[1]) {
            case "+" -> System.out.println(Float.parseFloat(input[0]) + Float.parseFloat(input[2]));
            case "-" -> System.out.println(Float.parseFloat(input[0]) - Float.parseFloat(input[2]));
            case "*" -> System.out.println(Float.parseFloat(input[0]) * Float.parseFloat(input[2]));
            case "/" -> {
                if ((Float.parseFloat(input[2])) != 0) System.out.println("На ноль делить нельзя");
                else System.out.println(Float.parseFloat(input[0]) / Float.parseFloat(input[2]));
            }
            default -> {
            }
        }
    }
}


