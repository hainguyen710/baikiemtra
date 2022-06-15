import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;
    Scanner sc = new Scanner(System.in);

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = sc.nextInt();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination() {
        this.destination = sc.next();
    }

    public boolean display() {
        if (this.number < 0) {
            System.out.println(getNumber() + " " + getDestination());
        } else {
            System.out.println("0");

        }
        return true;
    }
}
