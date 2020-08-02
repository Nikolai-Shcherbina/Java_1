package lesson_02;

import java.util.Arrays;

/**
 * 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
 * 2 Задать пустой целочисленный массив размером 8. Написать метод, который с помощью цикла заполнит его
 * значениями 1 4 7 10 13 16 19 22;
 * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив
 * и умножающий числа меньше 6 на 2;
 * 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
 * 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
 * заполнить его диагональные элементы единицами, используя цикл(ы);
 * 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, 1, 2, 3, 4]) → true.
 * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */
public class HomeWork_02 {
    // task 1
    private static void array(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
/*            if (arr1[i] == 0) arr1[i] = 1;
            else arr1[i] = 0;
        }*/
            arr1[i] = (arr1[i] == 0) ? 1 : 0;
        }
    }

    // task 2
    private static void array2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3 + 1;
        }
    }

    // task 3
    private static void array3(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
    }

    // task 4
    private static int arrayMaxNumber(int[] arr4) {
        int maxNumber = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > maxNumber)
                maxNumber = arr4[i];
        }
        return maxNumber;
    }

    private static int arrayMinNumber(int[] arr4) {
        int minNumber = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < minNumber)
                minNumber = arr4[i];
        }
        return minNumber;
    }

    // task 5
    private static int[][] arrayDioganal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j || i == a.length - 1 - j)
                    a[i][j] = 1;
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        array(arr1);// task 1
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[8];
        array2(arr2); // task 2
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        array3(arr3); // task 3
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = {-3, 5, 7, 23, 18, -10, 26, 114};
        System.out.println(arrayMaxNumber(arr4)); // task 4 Max
        System.out.println(arrayMinNumber(arr4)); // task 4 Min
        int[][] arr5 = new int[10][10];
        arrayDioganal(arr5); // task 5
    }
}