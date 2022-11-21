package lesson12.models;

import lesson12.Interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {

    private boolean inGame;
    private String name;

    CardImpl[] cardsOnHand = new CardImpl[10];

    @Override
    public void takeCard(CardImpl card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int result = 0;
        for (CardImpl card : cardsOnHand) {
            if (card != null) {
                result += card.getValue();
            }
        }
        return result;
    }

    @Override
    public boolean needCard() {
        System.out.println("---Ваши карты---");
        this.showCardsOnHands();
        System.out.println("Нужна ли вам еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHands() {
        for (CardImpl card : cardsOnHand) {
            if (card != null) {
                card.printCard();
            }
        }
    }

    @Override
    public boolean isInGame() {
        return false;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public String getName() {
        return name;
    }



    public PlayerImpl setName(String name) {
        this.name = name;
        return null;
    }
}
