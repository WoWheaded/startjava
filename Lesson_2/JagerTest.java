public class JagerTest {
    public static void main(String[] args) {
        Jager jager1 = new Jager();
        jager1.setMark("Mark-3");
        jager1.setModelName("Gipsy Danger");
        jager1.setCountry("United States of America");
        jager1.setHeight(79.25);
        jager1.setWeight(1.980);
        jager1.setSpeed(7);
        jager1.setStrength(8);
        jager1.setArmor(6);
        jager1.getInfo();
        jager1.usePiwerMove();
        jager1.useWeapons();
        jager1.setCountry("Belgium");
        System.out.println("New country = " + jager1.getCountry());
        jager1.setSpeed(12);
        System.out.println("New speed = " + jager1.getSpeed()); 
        System.out.println("");
        Jager jager2 = new Jager();
        jager2.setMark("Mark-4");
        jager2.setModelName("Crimson Typhoon");
        jager2.setCountry("China");
        jager2.setHeight(76.2);
        jager2.setWeight(1.722);
        jager2.setSpeed(9);
        jager2.setStrength(8);
        jager2.setArmor(6);
        jager2.getInfo();
        jager2.usePiwerMove();
        jager2.useWeapons();
        jager2.setMark("Mark-8");
        System.out.println("New mark = " + jager2.getMark());
        jager2.setArmor(88);
        System.out.println("New armor = " + jager2.getArmor());
    }
}