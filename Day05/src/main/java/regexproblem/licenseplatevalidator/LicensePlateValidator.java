package regexproblem.licenseplatevalidator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";

    public static boolean validate(String licensePlate) {
        if (licensePlate == null || licensePlate.isEmpty()) {
            return false;
        }
        return Pattern.matches(LICENSE_PLATE_PATTERN, licensePlate);
    }
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a license plate to validate: ");
        String licensePlate = scanner.nextLine();

        if (validate(licensePlate)) {
            System.out.println("Valid license plate!");
        } else {
            System.out.println("Invalid license plate.");
        }

        scanner.close();
    }
}

