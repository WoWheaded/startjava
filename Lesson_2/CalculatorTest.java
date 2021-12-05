import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            Calculator calculator = new Calculator();
            System.out.print("Введите первое число: " );
            calculator.setNum1(console.nextInt());
            System.out.print("введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(console.nextInt());
            calculator.calculate();
            console.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}