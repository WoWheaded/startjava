public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 55;
        if (age > 20) {
            System.out.println("совершеннолетний");
        } 

        boolean male = true;
        if (male) {
            System.out.println("Мужчина");
        } 

        if (!male) {
            System.out.println("Женщина");
        } 

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("средний рост");
        } else {
            System.out.println("высокий рост");
        } 

        char firstLetterName = 'I';
        if (firstLetterName == 'M') {
            System.out.println("Миша");
        } else if (firstLetterName == 'I') {
            System.out.println("Irakly");
        } else {
            System.out.println("UnkownName");
        }
    }
}