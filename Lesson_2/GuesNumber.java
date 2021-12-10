import java.util.Scanner;
import java.util.Random;

public class GuesNumber {

    public void startGame() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока - ");
        Player p1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока - ");
        Player p2 = new Player(console.nextLine());
        Random random = new Random();
        int guessp1;
        int guessp2;
        String answer = "";
        do { 
            int targetNumber = random.nextInt(100);
            System.out.println("(Число для угадывания - " + targetNumber + ")");
            while (!answer.equals("no")) {
                p1.guess();
                guessp1 = p1.getNumber();
                if (guessp1 > targetNumber) {
                    System.out.println("Загаданное число меньше");
                } else if (guessp1 < targetNumber) {
                    System.out.println("Загаданное число больше");
                } else if (guessp1 == targetNumber) {
                    System.out.println("Nгрок " + p1.getName() + " угадал!!!");
                    do {
                        System.out.println("Хотите продолжить партию? [yes/no]");
                        answer = console.nextLine();
                    } while (!answer.equals("yes") && !answer.equals("no"));
                    break;
                }
                p2.guess();
                guessp2 = p2.getNumber();
                if (guessp2 > targetNumber) {
                    System.out.println("Загаданное число меньше");
                } else if (guessp2 < targetNumber) {
                    System.out.println("Загаданное число больше");
                } else if (guessp2 == targetNumber) {
                    System.out.println("Nгрок " + p2.getName() + " угадал!!!");
                    do {
                        System.out.println("Хотите продолжить партию? [yes/no]");
                        answer = console.nextLine();
                    } while (!answer.equals("yes") && !answer.equals("no"));
                    break;
                }
            }
        } while (!answer.equals("no"));
    }
}