    import java.util.Scanner;

    public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = console.nextInt();
        System.out.println("Введите второе число");
        int num2 = console.nextInt();
        System.out.println("введите знак");
        char a = console.next().charAt(0);
        int result = 1;
        if (a == '+') {
            System.out.println(num1 + num2);
        } else if (a == '-') {
            System.out.println(num1 - num2);
        } else if (a == '*') {
            System.out.println(num1 * num2);
        } else if (a == '/') {
            double n1 = num1 * 1.0;
            double n2 = num2 * 1.0;
            System.out.println(n1 / n2);
        } else if (a == '^') {
            for(int i =0; i < num2; i++) {
                result = result * num1;
                } System.out.print(result);
        } else if (a == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Thanks");
        }
    }
}



