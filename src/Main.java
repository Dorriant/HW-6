public class Main {
    public static void main(String[] args) {
        // Циклы
// Задача 1
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

// Задача 2
        for (int i = 10; i <= 10 && i >= 1; i = i - 1){
            System.out.println(i);
        }

// Задача 3
        for (int i = 0; i < 17; i = i +2){
            System.out.println(i);
        }

// Задача 4
        for (int i = 10; i <=10 && i >= -10; i = i - 1){
            System.out.println(i);
        }

// Задача 5
        for (int i = 1904; i <=2096; i = i + 4){
            System.out.println(i);
        }

// Задача 6
        for (int i = 7; i >=7 && i < 100; i = i + 7){
            System.out.println(i);
        }

// Задача 7
        for (int i = 1; i >= 1 && i <= 512; i = i * 2){
            System.out.println(i);
        }

// Задача 8
        int salary = 29000;
        int total = 0;

        for (int i = 0; i < 12; i++){
            total = total + salary;
        }
        System.out.println(total);

// Задача 9
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++){
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println(total1);

// Задача 10
        int multiplier = 2;
        for (int i = 1; i <= 10;i++){
            System.out.println(multiplier + " * " + i + " = " + (multiplier * i));
        }
    }
}