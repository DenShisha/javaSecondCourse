package lesson5.hw;

import java.util.Scanner;

/**
 * 1
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 *
 * 2
 * 1.1. Создай массив на 10 чисел
 * 1.2. Считай с консоли 10 чисел и заполни ими массив
 * 2. Найти максимальное число из элементов массива
 *
 * 3
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 *
 * 4
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 *
 * 5
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 *
 * 6
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 * 7
 * Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //1.
//        String [] array = new String[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextLine();
//        }
//        for (int i = array.length - 1; i > 0; i--) {
//            System.out.println(array[i]);
//        }
//
//        //2.
//        int [] array = new int[10];
//        int max = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int j : array) {
//            if (j > max)
//                max = j;
//        }
//        System.out.println("Max: " + max);
//
//        //3.
//        String[] str = new String[10];
//        int[] num = new int[10];
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = scanner.nextLine();
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = str[i].length();
//            System.out.println(num[i]);
//        }
//
//        //4.
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int j = arr.length - 1; j >= 0; j--) {
//            System.out.println(arr[j]);
//        }
//
//        //5.
//        int[] array = new int[20];
//        int[] nums1 = new int[10];
//        int[] nums2 = new int[10];
//        int mean = array.length/2;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = array[i];
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            nums2[i] = array[i + mean];
//        }
//
//         for (int number : nums2) {
//             System.out.println(number);
//         }
//
//        //6.
//        int[] nums = new int[20];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int max = nums[0];
//        int min = nums[0];
//
//        for (int i : nums) {
//            if (i > max)
//                max = i;
//            else if (i < min)
//                min = i;
//        }
//        System.out.println(max + " " + min);

        //7.
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int count = 0;
                if (numbers[i] < numbers[j]) {
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }
            }
        }

        for (int g : numbers) {
            System.out.println(g);
        }
    }

}
