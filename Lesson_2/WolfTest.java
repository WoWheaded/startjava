public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.gender = "male";
        System.out.println("gender = " + wolf1.gender);
        wolf1.name = "Alex";
        System.out.println("name = " + wolf1.name);
        wolf1.weight = 55;
        System.out.println("weight = " + wolf1.weight);
        wolf1.age = 32;
        System.out.println("age = " + wolf1.age);
        wolf1.color = "brown";
        System.out.println("color = " + wolf1.color);
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}