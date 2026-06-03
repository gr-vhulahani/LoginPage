import java.util.Scanner;

public class LoginController {

    private static final int MIN_USERNAME_LENGTH = 3;
    private static final int MIN_PASSWORD_LENGTH = 8;

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        // Get username input
        System.out.print("Enter your username: ");
        user.setUsername(scanner.nextLine());

        // Validate username
        if (!isValidUsername(user)) {
            System.out.println("Username is too short!");
            return;
        }

        if (!isUsernameMatch(user)) {
            System.out.println("User does not exist!");
            return;
        }

        // Get password input
        System.out.print("Enter your password: ");
        user.setPassword(scanner.nextLine());

        // Validate password
        if (!isValidPassword(user)) {
            System.out.println("Password is too short!");
            return;
        }

        if (!isPasswordMatch(user)) {
            System.out.println("Access denied!");
            return;
        }

        System.out.println("Access granted");
        scanner.close();
    }

    private static boolean isValidUsername(User user) {
        return user.getUsernameInput().length() >= MIN_USERNAME_LENGTH;
    }

    private static boolean isUsernameMatch(User user) {
        return user.getUsernameInput().trim().equals(user.getUsername());
    }

    private static boolean isValidPassword(User user) {
        return user.getPasswordInput().length() >= MIN_PASSWORD_LENGTH;
    }

    private static boolean isPasswordMatch(User user) {
        return user.getPasswordInput().equals(user.getPassword());
    }

}
