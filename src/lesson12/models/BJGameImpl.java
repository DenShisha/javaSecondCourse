package lesson12.models;

import lesson12.Interfaces.BJGame;

public class BJGameImpl implements BJGame {

    PlayerImpl[] playersInGame = new PlayerImpl[10];
    DeckOfCardsImpl deck = new DeckOfCardsImpl();
    PlayerImpl player;

    @Override
    public void addPlayerToGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveToPlayersTwoCardsOnStart() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                player.takeCard(deck.randomCards());
                player.takeCard(deck.randomCards());
            }
        }
    }

    @Override
    public void giveCardToPlayerIfNeed() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                while (player.needCard()) {
                    player.takeCard(deck.randomCards());
                }
            }
        }
    }

    @Override
    public void determineWinner() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }

        //1. Победил крупье, если в игре никого не осталось
        if (countPlayersInGame() == 0) {
            System.out.println("Победило казино");
        }

        //2.
        if (countPlayersInGame() == 1) {
            for (PlayerImpl player : playersInGame) {
                if (player != null) {
                    if (player.isInGame() && !player.isCroupier()) {
                        System.out.println("Победил игрок " + player.getName());
                        System.out.println("С картами - ");// + распечатать имя
                        player.showCardsOnHands();
                        return;
                    } else if (player.isInGame()) {
                        System.out.println("Победило казино - ");
                        player.showCardsOnHands();
                        return;
                    }
                }
            }
        }

        int bestValue = 0;

        //3. Проверить значение карт игроков и выявить у кого рез-т лучше
        if (countPlayersInGame() > 1) {

            for (PlayerImpl player : playersInGame) {
                if (player != null) {
                    if (bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                    }
                }
            }
        }

        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.isInGame() && !player.isCroupier() && bestValue == player.countValuesOfAllCardsOnHand()) {
                    System.out.print(player.getName() + " ");
                    player.showCardsOnHands();
                }
            }
        }
    }

    @Override
    public int countPlayersInGame() {
        int players = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.isInGame()) {
                    players++;
                }
            }
        }
        return players;
    }
}
