public class Cycle{
    public static void main(String[] args){
         for(int f = 0; f <=20; f++) {
             System.out.println(f);
         }
         System.out.println(" ");

        int w = 6;
        while(w >= -6){
            System.out.println(w);
            w-=2;
        }
        System.out.println(" ");

        int a = 10;
        int sum = 0;
        do {
            if(a % 2 != 0) {
                sum = sum + a;
            }
            a++;
        }while (a <= 20);
        System.out.println("Сумма нечетных чисел с 10 до 20 = " + sum);
    }
}