public class Jager {
    private String mark;
    private String modelName;
    private String country;
    private double height;
    private double weight; 
    private int speed;
    private int strength;
    private int armor;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void usePiwerMove() {
        System.out.println("Я использую свой коронный удар!");
    }

    public void useWeapons() {
        System.out.println("Я использую своё оружие");
    }

    public void getInfo() {
        System.out.println("INFO:" + '\n' + "Mark = " + mark + '\n' + "Model name = " + modelName + '\n' + 
        "Country = " + country + '\n' + "Height = " + height + '\n' + "Weight = " + weight + '\n' + 
        "Speed = " + speed + '\n' + "Strenght = " + strength + '\n' + "Armor = " + armor);
    }
}