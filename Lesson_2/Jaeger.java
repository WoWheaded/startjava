public class Jaeger {
    private String mark;
    private String modelName;
    private String country;
    private double height;
    private double weight; 
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String mark, String modelName, String country, double height, double weight, int speed, int strength, int armor) {
        this.mark = mark;
        this.modelName = modelName;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void usePiwerMove() {
        System.out.println("Я использую свой коронный удар!");
    }

    public void useWeapons() {
        System.out.println("Я использую своё оружие");
    }

    public String toString() {
        return this.mark+ " "+ this.modelName+", "+this.country +" " +this.height+ " " +this.weight+" "+this.speed+" "+this.strength+" "+this.armor;
    }
}