package Singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score;
    private static GuessGame instance;

    Random randomNumber = new Random();
    Scanner scanner = new Scanner(System.in);

    private GuessGame() {

    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            int a = randomNumber.nextInt(11);

            System.out.println("Zgadnij, jak to liczba.");

            String linia = scanner.nextLine();
            Integer x = Integer.valueOf(linia);

            if (a == x) {
                addScore();
            }
            else {
                System.out.println("Nie udało sie odgadnąć");
            }
        }

        System.out.println("Koniec gry! Twój wynik to: " + getScore());
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        this.score += 1;
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            instance = new GuessGame();
        }
        return instance;
    }
}
