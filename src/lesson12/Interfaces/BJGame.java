package lesson12.Interfaces;

import lesson12.models.PlayerImpl;

public interface BJGame {
    // добавить игроков в игру

    void addPlayerToGame(PlayerImpl player);

    //Раздавать п о2 карты каждому игроку на старте

    void giveToPlayersTwoCardsOnStart();

    //Раздавать карты, пока это требуется игрокам

    void giveCardToPlayerIfNeed();

    //Определять победителя

    void determineWinner();

    int countPlayersInGame();
}
