package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("самец");
        System.out.println("Пол - " + wolf1.getGender());
        wolf1.setName("Alex");
        System.out.println("Nмя - " + wolf1.getName());
        wolf1.setWeight(55);
        System.out.println("Вес - " + wolf1.getWeight() + " кг");
        wolf1.setAge(5);
        System.out.println("Возраст - " + wolf1.getAge());
        wolf1.setColor("серый");
        System.out.println("Цвет шерсти - " + wolf1.getColor());
        wolf1.walk();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}