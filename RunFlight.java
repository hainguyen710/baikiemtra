

public class RunFlight {
    static Flight flight=new Flight();

    public static void main(String[] args) {
        System.out.println("Please enter your flight number");
        flight.setNumber();
        System.out.println("Please enter your destination");
        flight.setDestination();
        System.out.println(flight.display());

    }
}
