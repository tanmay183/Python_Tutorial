import java.util.*;

class Train {
    int trainNumber;
    String trainName;
    String origin;
    String destination;
    String departureTime;
    String arrivalTime;
    int seats;

    // Constructor
    public Train(int trainNumber, String trainName, String origin, String destination,
                 String departureTime, String arrivalTime, int seats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
    }

    // Display full train details
    public void displayDetails() {
        System.out.println("Train Number   : " + trainNumber);
        System.out.println("Train Name     : " + trainName);
        System.out.println("Origin         : " + origin);
        System.out.println("Destination    : " + destination);
        System.out.println("Departure Time : " + departureTime);
        System.out.println("Arrival Time   : " + arrivalTime);
        System.out.println("Seats Available: " + seats);
    }
}

public class TrainManagementSystem {

    static List<Train> trainList = new ArrayList<>();

    public static void addSampleTrains() {
        trainList.add(new Train(102, "Pune Express", "Pune", "Mumbai", "08:00", "10:30", 100));
        trainList.add(new Train(101, "Deccan Queen", "Pune", "Mumbai", "07:15", "09:45", 80));
        trainList.add(new Train(104, "Mumbai Express", "Mumbai", "Nagpur", "20:00", "07:00", 150));
        trainList.add(new Train(103, "Nagpur Express", "Nagpur", "Mumbai", "21:00", "07:30", 120));
    }

    public static void searchTrains(String origin, String destination) {
        List<Train> matchedTrains = new ArrayList<>();

        for (Train t : trainList) {
            if (t.origin.equalsIgnoreCase(origin) && t.destination.equalsIgnoreCase(destination)) {
                matchedTrains.add(t);
            }
        }

        if (matchedTrains.isEmpty()) {
            System.out.println("No trains found for the given route.");
            return;
        }

        // Sort matched trains by train number
        matchedTrains.sort(Comparator.comparingInt(t -> t.trainNumber));

        // Display results with train times
        System.out.println("\nAvailable trains:");
        System.out.println("No. | Train Number | Train Name        | Departure | Arrival");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < matchedTrains.size(); i++) {
            Train t = matchedTrains.get(i);
            System.out.printf("%-4d| %-13d| %-18s| %-9s| %-7s\n",
                    (i + 1), t.trainNumber, t.trainName, t.departureTime, t.arrivalTime);
        }

    }

    public static void main(String[] args) {
        addSampleTrains();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Origin Station     : ");
        String origin = scanner.nextLine();
        System.out.print("Enter Destination Station: ");
        String destination = scanner.nextLine();

        searchTrains(origin, destination);
    }
}
