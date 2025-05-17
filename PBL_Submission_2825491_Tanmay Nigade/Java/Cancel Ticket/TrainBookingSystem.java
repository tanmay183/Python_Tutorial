import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Train {
    int trainNumber;
    String trainName;
    String origin;
    String destination;
    int seats;
    String time;

    public Train(int trainNumber, String trainName, String origin, String destination, int seats, String time) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.origin = origin;
        this.destination = destination;
        this.seats = seats;
        this.time = time;
    }

    public void displayTrain() {
        System.out.println("\nTrain Number  : " + trainNumber);
        System.out.println("Train Name    : " + trainName);
        System.out.println("From          : " + origin);
        System.out.println("To            : " + destination);
        System.out.println("Time          : " + time);
        System.out.println("Available Seats: " + seats);
    }
}

class Booking {
    private static int bookingCounter = 1000;

    int bookingId;
    String customerId;
    int trainNumber;
    List<Integer> seatNumbers;
    String bookingDate;
    double fare;
    String bookingStatus;

    public Booking(String customerId, int trainNumber, List<Integer> seatNumbers,
                   String bookingDate, double fare, String bookingStatus) {
        this.bookingId = bookingCounter++;
        this.customerId = customerId;
        this.trainNumber = trainNumber;
        this.seatNumbers = seatNumbers;
        this.bookingDate = bookingDate;
        this.fare = fare;
        this.bookingStatus = bookingStatus;
    }

    public void displayTicket() {
        System.out.println("\n🎫 Booking Confirmation:");
        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Train Number   : " + trainNumber);
        System.out.println("Seat Numbers   : " + seatNumbers);
        System.out.println("Booking Date   : " + bookingDate);
        System.out.println("Total Fare     : ₹" + fare);
        System.out.println("Booking Status : " + bookingStatus);
    }
}

public class TrainBookingSystem {
    static List<Train> trainList = new ArrayList<>();
    static List<Booking> bookings = new ArrayList<>();

    public static void addSampleTrains() {
        trainList.add(new Train(101, "Express A", "Pune", "Mumbai", 80, "08:00 AM"));
        trainList.add(new Train(102, "Express B", "Mumbai", "Pune", 60, "11:30 AM"));
        trainList.add(new Train(103, "Express C", "Delhi", "Mumbai", 100, "06:00 PM"));
    }

    public static void searchTrains(String origin, String destination) {
        boolean found = false;
        for (Train train : trainList) {
            if (train.origin.equalsIgnoreCase(origin) && train.destination.equalsIgnoreCase(destination)) {
                train.displayTrain();
                found = true;
            }
        }
        if (!found) {
            System.out.println(" No trains found for the given route.");
        }
    }

    public static void bookTrain() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID       : ");
        String customerId = sc.nextLine();

        System.out.print("Enter Train Number      : ");
        int trainNumber = sc.nextInt();
        sc.nextLine();

        Train selectedTrain = null;
        for (Train t : trainList) {
            if (t.trainNumber == trainNumber) {
                selectedTrain = t;
                break;
            }
        }

        if (selectedTrain == null) {
            System.out.println(" Train not found.");
            return;
        }

        System.out.print("Enter Booking Date (yyyy-mm-dd): ");
        String bookingDate = sc.nextLine();

        System.out.print("Enter number of seats to book  : ");
        int numSeats = sc.nextInt();

        if (numSeats > selectedTrain.seats) {
            System.out.println(" Not enough seats available.");
            return;
        }

        List<Integer> seatNumbers = new ArrayList<>();
        for (int i = 1; i <= numSeats; i++) {
            seatNumbers.add(selectedTrain.seats - numSeats + i);
        }

        double farePerSeat = 150.00;
        double totalFare = farePerSeat * numSeats;
        selectedTrain.seats -= numSeats;

        Booking newBooking = new Booking(customerId, trainNumber, seatNumbers, bookingDate, totalFare, "CONFIRMED");
        bookings.add(newBooking);
        newBooking.displayTicket();
    }

    public static void cancelBooking() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Booking ID to cancel: ");
        int cancelId = sc.nextInt();
        sc.nextLine();

        Booking target = null;
        for (Booking b : bookings) {
            if (b.bookingId == cancelId && b.bookingStatus.equalsIgnoreCase("CONFIRMED")) {
                target = b;
                break;
            }
        }

        if (target == null) {
            System.out.println(" Booking not found or already cancelled.");
            return;
        }

        LocalDate today = LocalDate.now();
        LocalDate bookingDate = LocalDate.parse(target.bookingDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if (!bookingDate.isAfter(today)) {
            System.out.println(" Cannot cancel on or after the travel date.");
            return;
        }

        for (Train t : trainList) {
            if (t.trainNumber == target.trainNumber) {
                t.seats += target.seatNumbers.size();
                break;
            }
        }

        target.bookingStatus = "CANCELLED";
        System.out.println("Booking ID " + target.bookingId + " has been cancelled successfully.");
    }

    public static void main(String[] args) {
        addSampleTrains();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Train Booking System =====");
            System.out.println("1. Search Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Origin     : ");
                    String origin = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();
                    searchTrains(origin, destination);
                    break;
                case 2:
                    bookTrain();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    System.out.println("Thank you for using the Train Booking System!");
                    return;
                default:
                    System.out.println(" Invalid option.");
            }
        }
    }
}
