import java.util.*;

class Customer {
    private String userName;
    private String email;
    private String password;
    private String address;
    private String contactNumber;

    public Customer(String userName, String email, String password, String address, String contactNumber) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public boolean verifyPassword(String currentPassword) {
        return this.password.equals(currentPassword);
    }

    public void updateProfile(Scanner sc) {
        System.out.println("\nUpdate Profile");

        System.out.print("Enter current password to proceed: ");
        String currentPassword = sc.nextLine().trim();

        if (!verifyPassword(currentPassword)) {
            System.out.println("Incorrect password. Cannot update profile.");
            return;
        }

        System.out.print("Enter new user name (press Enter to keep unchanged): ");
        String newUserName = sc.nextLine().trim();
        if (!newUserName.isEmpty()) {
            this.userName = newUserName;
        }

        System.out.print("Enter new address (press Enter to keep unchanged): ");
        String newAddress = sc.nextLine().trim();
        if (!newAddress.isEmpty()) {
            this.address = newAddress;
        }

        System.out.print("Enter new contact number (10 digits) (press Enter to keep unchanged): ");
        String newContact = sc.nextLine().trim();
        if (!newContact.isEmpty() && newContact.matches("\\d{10}")) {
            this.contactNumber = newContact;
        }

        System.out.print("Do you want to change your password? (yes/no): ");
        String changePwd = sc.nextLine().trim().toLowerCase();
        if (changePwd.equals("yes")) {
            System.out.print("Enter new password (6 to 12 characters): ");
            String newPassword = sc.nextLine().trim();
            if (newPassword.length() >= 6 && newPassword.length() <= 12) {
                this.password = newPassword;
            } else {
                System.out.println("Password must be between 6 to 12 characters. Password not changed.");
            }
        }

        System.out.println("Your Details updated successfully");
    }

    public void displayProfile() {
        System.out.println("\nProfile Information");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactNumber);
    }
}

public class UserProfileManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer(
                "John Doe",
                "john@example.com",
                "john123",
                "123 Park Avenue, New York",
                "9876543210"
        );

        customer.displayProfile();
        customer.updateProfile(sc);
        customer.displayProfile();

        sc.close();
    }
}
