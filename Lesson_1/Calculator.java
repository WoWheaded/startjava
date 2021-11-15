    import java.util.Scanner;

    public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = console.nextInt();
        System.out.println("Введите второе число");
        int num2 = console.nextInt();
        System.out.println("введите знак");
        char c = console.next().charAt(0);
        int result = 1;
        
        while (num1 >= 0 && num2 >= 0) {
        if (c == '+') {
            System.out.println(num1 + num2);
        } else if (c == '-') {
            System.out.println(num1 - num2);
        } else if (c == '*') {
            System.out.println(num1 * num2);
        } else if (c == '/') {
            double m = num1 * 1.0;
            double n = num2 * 1.0;
            System.out.println(m / n);
        } else if (c == '^') {
            for(int a =0; a < num2; a++) {
                result = result * num1;
                } System.out.print(result);
        } else if (c == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Thanks");
        } 
        break;
        }
    }
}


