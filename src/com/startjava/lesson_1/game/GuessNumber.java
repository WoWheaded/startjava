package com.startjava.lesson_1.game;

public class GuessNumber {
    public static void main(String[] args) {
        int compNumber = 83;
        int playerNumber = 85;
        System.out.println("Угадай число");
        while (compNumber != playerNumber) {
            while (compNumber > playerNumber) {
                System.out.println(playerNumber);
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber++;
            } 
            while (compNumber < playerNumber) {
                System.out.println(playerNumber);
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber--;
            }
            System.out.println("Загаданное число: " + compNumber);
            System.out.println("Поздравляю, число угадано!");
        }
    }
}