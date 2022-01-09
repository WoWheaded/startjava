package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока - ");
        Player p1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока - ");
        Player p2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(p1, p2);
        String answer;
        do {
            game.startGame();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
        /*Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока - ");
        Player p1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока - ");
        Player p2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(p1, p2);
        String answer;
        do {
            game.startGame();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}*/