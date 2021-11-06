public class ConditionalStatement{
    public static void main(String[] args) {

        int age = 58;
        boolean male = false;
        double height = 1.90;
        char firstLetterName = 'E';


        if(age > 20) {
            System.out.println("совершеннолетний");
        }
        
        if(male == true){
            System.out.println("Мужчина");
        }

        if(male != true){
            System.out.println("Женщина");
        }

        if(height < 1.80) {
            System.out.println("средний рост");
        } else {
            System.out.println("высокий рост");
        }

        if(firstLetterName == 'M') {
            System.out.println("Миша");
        } else if(firstLetterName == 'I') {
            System.out.println("Irakly");
        } else {
            System.out.println("UnkownName");
        }
    }
}


