    import java.util.Scanner;

    public class game1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");
        int range = 100;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Поздравляю, число угадано!");
                break;
            } else if (input_number > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else{
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}
