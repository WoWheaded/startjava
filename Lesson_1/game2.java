public class game2 {
        public static void main(String[] args) {
        int compNumber = 10;
        System.out.println("Угадай число");
        int playerNumber = 83;

        while (true) {
            if (compNumber == playerNumber) {
                System.out.println("Загаданное число: " + compNumber);
                System.out.println("Поздравляю, число угадано!");
                break;
            } while (compNumber > playerNumber) {
                System.out.println(playerNumber);
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber++;
            } while (compNumber < playerNumber) {
                System.out.println(playerNumber);
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber--;
            }
        }
    }
}