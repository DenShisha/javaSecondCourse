package lesson12;

import lesson12.Interfaces.BJGame;
import lesson12.Interfaces.Card;
import lesson12.Interfaces.Player;
import lesson12.models.*;

import java.util.Scanner;

/**
 * Игра BlackJack
 * Цель заключается в том, чтобы набрать как можно больше очков, но не более 21 и обыграть нужно крупье.
 * В игре используется от одной до восьми колод. Из-за того что вероятность комбинации блек-джек при большем
 * числе колод ниже, то преимущество игрока уменьшается при увеличении числа колод. При игре с шаффл-машинкой
 * считается, что используется бесконечная колода.
 *
 * Значения очков каждой карты:
 *      от двойки до десятки — от 2 до 10 соответственно;
 *      у туза — 1 или 11 (11 пока общая сумма не больше 21, далее 1);
 *      у т. н. картинок (король, дама, валет) — 10;
 *
 * Если у игрока и дилера число очков на руках равное, то такая ситуация называется «ровно»: за рубежом это
 * называется — пуш (англ. push). В такой ситуации все остаются при своих ставках, никто не выигрывает и не
 * проигрывает. Хотя в казино бывают исключения, и при «push» выигрывает казино
 */

    // 1. Создаем игру
    // 2. Создавать игроков
    // 3. Создать крупье
    // 4. Добавить игроков и добавить крупье в игру
    // 5. Добавить колоду карт
    // 6. Добавить карты в колоду
    // 7. Раздать по 2 карты каждому игроку
    // 8. Раздавать каждому по 2 карты, пока это требуется
    // 9. Определить победителя

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Создаем игру
        BJGame game = new BJGameImpl();

        // 2. Создавать игроков
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();
        System.out.println("Введите имена игроков: ");
        player1.setName(scanner.nextLine());
        player2.setName(scanner.nextLine());

        // 3. Создать крупье
        Croupier croupier = new Croupier();

        // 4. Добавить игроков и добавить крупье в игру
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(croupier);

        // 5. Добавить колоду карт
        DeckOfCards deckOfCards = new DeckOfCardsImpl();
        deckOfCards.randomCards();

        // 7. Раздать по 2 карты каждому игроку
        game.giveToPlayersTwoCardsOnStart();

        // 8. Раздавать каждому по 2 карты, пока это требуется
        game.giveCardToPlayerIfNeed();

        // 9. Определить победителя
        game.determineWinner();
    }

}
