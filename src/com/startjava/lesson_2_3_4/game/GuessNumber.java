package com.startjava.lesson_2_3_4.game;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int hiddenNumber;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        boolean isFound = false;
        hiddenNumber = getHiddenNumber();
        int count = 0;
        System.out.println("У выс есть 5 попыток, чтобы угадать число");
        System.out.println(hiddenNumber);
        do {
            int playerGuess = makeGuess(p1);
            if (compare(playerGuess)) {
                System.out.println(p1.getName() + ", ты угадал число с  " + (count + 1) + " попыток");
                break;
            }
            compareCountAttempts(p2);
            playerGuess = makeGuess(p2);
            if (compare(playerGuess)) {
                System.out.println(p2.getName() + ", ты угадал число с  " + (count + 1) + " попыток");
                break;
            }
            compareCountAttempts(p2);
            count++;
        } while (count < 5);
        printAttempts(p1);
        printAttempts(p2);
        p1.clearAttempts();
        p2.clearAttempts();
    }

    private int getHiddenNumber() {
        Random random = new Random();
        return hiddenNumber = random.nextInt(100);

    }

    private int makeGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", вводи число");
        int playerGuess = scanner.nextInt();
        player.setAttempts(playerGuess);
        return playerGuess;
    }

    private boolean compare(int playerGuess) {
        if (playerGuess < hiddenNumber) {
            System.out.println("Твое число меньше загаданного");
        } else if (playerGuess > hiddenNumber) {
            System.out.println("Твое число больше загаданного");
        }
        return playerGuess == hiddenNumber;
    }

    private void compareCountAttempts(Player player) {
        if (player.getCount() == 10) {
            System.out.println(player.getName() + ", ты потратилвсе попытки ");
        }
    }

    private void printAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ", твои ответы ");
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println("");
    }
}



   /* Scanner console = new Scanner(System.in);
    private final Player p1;
    private final Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startGame() {
        Random random = new Random();
        int targetNumber = random.nextInt(100);
        System.out.println("(Загаданное число - " + targetNumber + ")");
        do {
            System.out.print("Nгрок " + p1.getName() + " вводит число - ");
            p1.setNumber(console.nextInt());
            if (p1.getNumber() > targetNumber) {
                System.out.println("Загаданное число меньше");
            } else if (p1.getNumber() < targetNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Появился бобедитель - " + p1.getName() + "!!!");
                break;
            }
            System.out.println("");
            System.out.print("Nгрок " + p2.getName() + " вводит число - ");
            p2.setNumber(console.nextInt());
            if (p2.getNumber() > targetNumber) {
                System.out.println("Загаданное число меньше");
            } else if (p2.getNumber() < targetNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Появился бобедитель - " + p2.getName() + "!!!");
                break;
            }
        } while (true);
    }
}*/