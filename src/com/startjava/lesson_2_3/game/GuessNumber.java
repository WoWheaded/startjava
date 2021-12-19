package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    private Player p1;
    private Player p2;

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
}