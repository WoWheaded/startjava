public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        } System.out.println(" ");

        int counter1 = 6;
        while (counter1 >= -6) {
            System.out.println(counter1);
            counter1 -= 2;
        } System.out.println(" ");

        int counter2 = 10;
        int sum = 0;
        do {
            if (counter2 % 2 != 0) {
                sum += counter2;
            } 
            counter2++;
        } while (counter2 <= 20);
        System.out.println("Сумма нечетных чисел с 10 до 20 = " + sum);
    }
}