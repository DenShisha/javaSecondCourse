package lesson7;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        //Задача 1. Написать таймер.
//        for (int day = 0; day < 365; day++) {
//            for (int hour = 0; hour < 24; hour++) {
//                for (int min = 0; min < 60; min++) {
//                    for (int sec = 0; sec < 60; sec++) {
//                        Thread.sleep(1000);
//                        // %d - числовые типы, %s - строковые, \n - перенос каретки
//                        String name = "Денис";
//                        System.out.printf("%s, Прошло дней %d, час(ов) %d " +
//                                ", минут %d , секунд %d", name, day, hour, min, sec);
//                    }
//                }
//            }
//        }

        // Двумерные массивы
        //int [][] = new int[3][];
        //i - строки, j - столбцы
        int [][] numbers = {{5, 5, 8},
                            {6, 7, 8},
                            {1, 0, 8}};
        System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.print(numbers[0][2]);
        System.out.println();

        System.out.print(numbers[1][0]);
        System.out.print(numbers[1][1]);
        System.out.print(numbers[1][2]);
        System.out.println();

        System.out.print(numbers[2][0]);
        System.out.print(numbers[2][1]);
        System.out.print(numbers[2][2]);
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задача 2. Наполенине двумерного массива цифрами от 10 + 5");
        int [][] nums2 = new int[5][5];
        int start = 10;
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums2[i][j] = start;
                start += 5;
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Задача 3. Распечатать двумерный массив по диагонали");

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(nums2[i][j] + " ");
                else
                    System.out.println("X");
            }
            System.out.println();
        }

    }

}
