package lesson_01;
/*
1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
   где a, b, c, d – целочисленные входные параметры этого метода;
2. Написать метод, принимающий на вход два целых числа,
   и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
   если да – вернуть true, в противном случае – false;
3. Написать метод, которому в качестве параметра передается целое число,
   метод должен проверить положительное ли число передали, или отрицательное.
   Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
4. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
   метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
5. *Написать метод, который определяет является ли год високосным.
   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
   Для проверки работы вывести результаты работы метода в консоль*/

public class HomeWork_01 {
    // task 1
    private static float calculates(int a, int b, int c, int d) {
        return a * (b + (c / (d + 0.0f)));
    }

    // task 2
    private static boolean checksRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // task 3
    private static boolean checksPositiveNumber(int x) {
        return x >= 0;
    }

    // task 4
    public static String printWelcomeMessage(String name) {
        return "Привет, " + name + "!";
    }

    // task: 5 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    private static boolean definesLeapYear(int y) {
        return y % 4 == 0 || y % 400 == 0 && y % 100 != 0;
    }

    public static void main(String[] args) {
        calculates(2, 7, 10, 3); // task 1
        checksRange(7, 1); // task 2
        System.out.println("Число -7 положительное? - " + checksPositiveNumber(-7)); // task 3
        System.out.println(printWelcomeMessage("Nikolai")); //task 4
        System.out.println("2020 год високосный? - " + definesLeapYear(2020)); // task 5
    }
}
