package lesson11;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        //1.Создание игры
        SaperGame saperGame = new SaperGame();

        //2. Спросить у пользователя сложность игры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень сложности от 1 до 3");
        System.out.println("1 - высокий");
        System.out.println("2 - средний");
        System.out.println("3 - низкий");

        int level = scanner.nextInt();

        //3. Настраивать сложность
        saperGame.bombsByLevel(level);

        //4. Расставить вспомогательные цифры

        saperGame.placeHelpNumberOnMap();

        saperGame.printMapGame();

        while (true) {
            int check = 0;
            System.out.println("Введите координаты по оси Х от 0 до 10");
            int pointX = scanner.nextInt();
            System.out.println("Введите координаты по оси Y от 0 до 10");
            int pointY = scanner.nextInt();

            if (pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0) {
                System.out.println("Некорректный ввод, выход за поле");
                continue;
            }
            saperGame.printMapGame();

            check = saperGame.checkPointsPlayer(pointX, pointY); // 1, 2, -1

            if (check == 2) {
                System.out.println("Вы уже вводили данные координаты. Введите координаты еще раз");
            } else if (check == 1) {
                System.out.println("Следующий ход");
            } else if (check == -1) {
                System.out.println("Бомба!!! Вы проиграли!!!");
            } else {
                System.out.println("Поздравляю! Вы победили!");
            }
            saperGame.printMapGame();
        }
    }

}
