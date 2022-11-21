package lesson12.Interfaces;

import lesson12.models.CardImpl;

public interface Player {
    void takeCard(CardImpl card); // взять карту из колоды

    int countValuesOfAllCardsOnHand(); // посчитать количество очков в картах на руках

    boolean needCard(); // ответит игре нужна ли карта

    void showCardsOnHands(); // показать карты

    boolean isInGame();

    boolean isCroupier();

    void setInGame(boolean inGame);

}
