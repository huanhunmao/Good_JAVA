import java.util.Scanner;

public class Loop_do_while_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Menu:");
            System.out.println("1. View Profile");
            System.out.println("2. Edit Profile");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Viewing profile...");
                    break;
                case 2:
                    System.out.println("Exiting profile...");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }while(choice != 3);
    }
}
