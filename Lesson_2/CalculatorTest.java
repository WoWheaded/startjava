import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            Calculator pice = new Calculator();
            System.out.print("Введите первое число: " );
            pice.setNum1(console.nextInt());
            System.out.print("введите знак математической операции: ");
            pice.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            pice.setNum2(console.nextInt());
            pice.calculate();
            answer = "";
            console.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = console.nextLine();
            }
        } while (!answer.equals("no"));
    }
}