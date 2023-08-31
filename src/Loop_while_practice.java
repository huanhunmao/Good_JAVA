import java.util.Scanner;

public class Loop_while_practice {
    public static void main(String[] args) {
//        拿到系统输入
        Scanner scanner = new Scanner(System.in);
        String validPassword = "secret";
        String inputPassword;

        System.out.println("Please enter your password:");
        inputPassword = scanner.nextLine();

//        校验
        while (!inputPassword.equals(validPassword)) {
            System.out.println("Incorrect password. Please try again:");
            inputPassword = scanner.nextLine();
        }

        System.out.println("Login successful!");
    }
}
