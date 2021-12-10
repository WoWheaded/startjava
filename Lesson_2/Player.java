import java.util.Scanner;

public class Player {
    private String name;
    private int number;

    public String getName(){
        return name;
    }

     public int getNumber() {
        return number;
    }

    public Player(String name) {
        this.name = name;
    }

    public void guess() {
        Scanner consol = new Scanner(System.in);
        System.out.print(name + " думает что это число - " );
        number = consol.nextInt();
    }
}