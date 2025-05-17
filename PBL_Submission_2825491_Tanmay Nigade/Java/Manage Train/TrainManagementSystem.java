import java.util.*;

class Train {
    private int trainNumber;
    private String trainName;
    private String originStation;
    private String destinationStation;
    private String departureTime;
    private String arrivalTime;
    private int numberOfSeats;

    public Train(int trainNumber, String trainName, String originStation, String destinationStation,
                 String departureTime, String arrivalTime, int numberOfSeats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.originStation = originStation;
        this.destinationStation = destinationStation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.numberOfSeats = numberOfSeats;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void updateTrainDetails(Scanner sc) {
        System.out.print("Enter new train name: ");
        this.trainName = sc.nextLine();

        System.out.print("Enter new origin station: ");
        this.originStation = sc.nextLine();

        System.out.print("Enter new destination station: ");
        this.destinationStation = sc.nextLine();

        System.out.print("Enter new departure time: ");
        this.departureTime = sc.nextLine();

        System.out.print("Enter new arrival time: ");
        this.arrivalTime = sc.nextLine();

        System.out.print("Enter new number of seats: ");
        this.numberOfSeats = Integer.parseInt(sc.nextLine());

        System.out.println("Train details updated successfully");
    }

    public void displayTrain() {
        System.out.println("\nTrain Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Origin Station: " + originStation);
        System.out.println("Destination Station: " + destinationStation);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

public class TrainManagementSystem {
    private static List<Train> trainList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTrain Management System");
            System.out.println("1. Add New Train");
            System.out.println("2. Update Existing Train");
            System.out.println("3. View All Trains");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addNewTrain(sc);
                    break;
                case 2:
                    updateTrain(sc);
                    break;
                case 3:
                    viewTrains();
                    break;
                case 4:
                    System.out.println("Exiting system");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }

    private static void addNewTrain(Scanner sc) {
        System.out.print("Enter train number: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Enter train name: ");
        String name = sc.nextLine();

        System.out.print("Enter origin station: ");
        String origin = sc.nextLine();

        System.out.print("Enter destination station: ");
        String destination = sc.nextLine();

        System.out.print("Enter departure time: ");
        String depTime = sc.nextLine();

        System.out.print("Enter arrival time: ");
        String arrTime = sc.nextLine();

        System.out.print("Enter number of seats: ");
        int seats = Integer.parseInt(sc.nextLine());

        Train train = new Train(number, name, origin, destination, depTime, arrTime, seats);
        trainList.add(train);

        System.out.println("Train added successfully");
    }

    private static void updateTrain(Scanner sc) {
        System.out.print("Enter train number to update: ");
        int number = Integer.parseInt(sc.nextLine());

        for (Train train : trainList) {
            if (train.getTrainNumber() == number) {
                train.updateTrainDetails(sc);
                return;
            }
        }

        System.out.println("Train not found");
    }

    private static void viewTrains() {
        if (trainList.isEmpty()) {
            System.out.println("No trains available");
            return;
        }

        for (Train train : trainList) {
            train.displayTrain();
        }
    }
}

