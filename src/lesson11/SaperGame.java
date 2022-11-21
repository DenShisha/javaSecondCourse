package lesson11;

import java.util.concurrent.ThreadLocalRandom;

public class SaperGame {

    private int row;
    private int column;

    public int[][] mapGame = new int[10][10];
    public int[][] visibleMap = new int[10][10];

    public SaperGame() {
    }

    public SaperGame(int row, int column) {
        this.row = row;
        this.column = column;
        mapGame = new int[row][column];
        visibleMap = new int[row][column];
    }

    public void bombsByLevel(int level) {

        int countBombs = 0;

        if (level == 1) {
            countBombs = 20;
        } else if (level == 2) {
            countBombs = 15;
        } else {
            countBombs = 10;
        }

        for (int i = 0; i < countBombs; i++) {
            this.addRandomBomb();
        }

    }

    public void addRandomBomb() {
        int row = ThreadLocalRandom.current().nextInt(0,10);
        int column = ThreadLocalRandom.current().nextInt(0,10);

        if (mapGame[row][column] != -1) {
            mapGame[row][column] = -1;
        } else
            this.addRandomBomb();
    }

    public void placeHelpNumberOnMap() {
        for (int i = 0; i < mapGame.length; i++) { // строки (row)
            for (int j = 0; j < mapGame[i].length; j++) { // колонки (column)
                if (mapGame[i][j] == -1) {
                    for (int k = i - 1; k <= i + 1; k++) { // строки возле бомбы
                        for (int l = j - 1; l <= j + 1; l++) { // колонки возле бомбы
                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame.length) && mapGame[k][l] != -1) {
                                mapGame[k][l]++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void printMapGame() {
        for (int i = 0; i < mapGame.length; i++) {
            for (int j = 0; j < mapGame[i].length; j++) {
                if (visibleMap[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("   ");
                    } else if (mapGame[i][j] == -1) {
                        System.out.print("БАХ");
                        break;
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }

      public int checkPointsPlayer(int pointX, int pointY) {
        if (pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0) {
            return 1; //Следующий ход
        } else if (visibleMap[pointX][pointY] == 1) {
            return 2;
        }
        visibleMap[pointX][pointY] = 1;

        if (mapGame[pointX][pointY] == -1) {
            return -1;
        } else if (mapGame[pointX][pointY] > 0) {
            return checkVictoryGame();
        } else {
            this.checkZeroOnMapGame(pointX, pointY);
            return checkVictoryGame();
        }
    }

    private void checkZeroOnMapGame(int pointX, int pointY) {
        visibleMap[pointX][pointY] = 1;
        for (int i = pointX - 1; i <= pointX; i++) {
            for (int j = pointY - 1; j <= pointY; j++) {
                if ((i >= 0 && i < mapGame.length) && (j >= 0 && j < mapGame.length) && (mapGame[i][j] >= 0)) {
                    if (mapGame[i][j] == 0 && visibleMap[i][j] == 0) {
                        this.checkZeroOnMapGame(i, j);
                    } else {
                        visibleMap[i][j] = 1;
                    }
                }
            }
        }
    }

    private int checkVictoryGame() {
        int check = 0;

        for (int i = 0; i < visibleMap.length; i++) {
            for (int j = 0; j < visibleMap[i].length; j++) {
                if (visibleMap[i][j] == 0 && mapGame[i][j] != -1) {
                    check = 1;
                    break;
                }
            }
        }
        return check;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
