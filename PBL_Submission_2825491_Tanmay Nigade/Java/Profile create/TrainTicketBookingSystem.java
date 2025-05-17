import java.util.*;

class Customer {
    private String userName;
    private String email;
    private String password;
    private String address;
    private String contactNumber;
    private int userId;

    public Customer(String userName, String email, String password,
                    String address, String contactNumber, int userId) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contactNumber = contactNumber;
        this.userId = userId;
    }

    public void displayAcknowledgement() {
        System.out.println("\n Registration Successful!");
        System.out.println("Welcome, " + userName + "!");
        System.out.println(" Your generated User ID is: " + userId);
        System.out.println("You can now book and manage your train tickets.");
    }

    public String getEmail() {
        return email;
    }
}

public class TrainTicketBookingSystem {
    private static final Set<String> registeredEmails = new HashSet<>();
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Train Ticket Booking - New User Registration ");

        String userName = inputUserName();
        String email = inputUniqueEmail();
        String password = inputPassword();
        String address = inputAddress();
        String contactNumber = inputContactNumber();
        int userId = generateUserId();

        Customer newCustomer = new Customer(userName, email, password, address, contactNumber, userId);
        registeredEmails.add(email);

        newCustomer.displayAcknowledgement();
    }

    private static String inputUserName() {
        while (true) {
            System.out.print("\nEnter User Name (Max 50 characters): ");
            String input = sc.nextLine().trim();
            if (!input.isEmpty() && input.length() <= 50) return input;
            System.out.println("Invalid input. Please enter a valid name within 50 characters.");
        }
    }

    private static String inputUniqueEmail() {
        while (true) {
            System.out.print("\nEnter Email (must be unique and valid): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.contains("@") && input.contains(".") && !registeredEmails.contains(input)) return input;
            System.out.println("Email is either invalid or already registered. Please try a different one.");
        }
    }

    private static String inputPassword() {
        while (true) {
            System.out.print("\nEnter Password (6 to 12 characters): ");
            String input = sc.nextLine().trim();
            if (input.length() >= 6 && input.length() <= 12) return input;
            System.out.println("Password must be between 6 and 12 characters.");
        }
    }

    private static String inputAddress() {
        while (true) {
            System.out.print("\nEnter Address (Street, City - Max 100 characters): ");
            String input = sc.nextLine().trim();
            if (!input.isEmpty() && input.length() <= 100) return input;
            System.out.println("Address must be non-empty and within 100 characters.");
        }
    }

    private static String inputContactNumber() {
        while (true) {
            System.out.print("\nEnter Contact Number (exactly 10 digits): ");
            String input = sc.nextLine().trim();
            if (input.matches("\\d{10}")) return input;
            System.out.println("Contact number must be exactly 10 digits.");
        }
    }

    private static int generateUserId() {
        return 10000 + random.nextInt(90000);
    }
}
