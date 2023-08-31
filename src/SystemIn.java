import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一些数字: ");
        int inputValue = scanner.nextInt();
        System.out.println("你输入的数字是: " + inputValue);

        scanner.close(); // 关闭输入流
    }
}
