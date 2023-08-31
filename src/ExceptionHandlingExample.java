import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("请输入被除数: ");
            int divident = scanner.nextInt();

            System.out.println("请输入除数: ");
            int divisor = scanner.nextInt();

            int result = divide(divident,divisor);

            System.out.println("结果为: " + result);
        }catch(ArithmeticException e){
        System.out.println("运算出错: " + e.getMessage());
        }catch(Exception e){
        System.out.println("未知错误: " + e.getMessage());
        }finally {
            scanner.close(); // 在finally块中关闭Scanner，确保资源被释放
        }
    }

    public static int divide(int divident, int divisor) {
        return divident/divisor;
    }
}
