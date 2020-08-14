package lesson_06;

import java.io.*;
import java.util.Random;

/**
 * 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 * 3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
 * 4. ** Написать метод, проверяющий, есть ли указанное слово в папке
 */
public class Main {
    private static final Random random = new Random();

    private static String generatorLetters(int a) {
        int min = 97;
        int min1 = 65;
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < a; i++)
            if (i % 5 == 0) letters.append((char) (min1 + random.nextInt(25 - 1)));
            else letters.append((char) (min + random.nextInt(25 - 1)));
        return letters.toString();
    }

    public static void main(String[] args) {
       // OutputStream out;
       // InputStream in;
        try {
            FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt");
            fos1.write(generatorLetters(100).getBytes());
            fos1.flush();
            fos1.close();
            fos2.write(generatorLetters(75).getBytes());
            fos2.flush();
            fos2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
