
public class FunctionReload {
    public static int add(int a, int b) {
        // 重载方法，接受两个整数参数
        return a + b;
    }

    // 重载方法，接受三个整数参数
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 重载方法，接受一个字符串和一个整数参数
    public static String add(String str, int num) {
        return str + num;
    }


    public static void main(String[] args) {
        FunctionReload math = new FunctionReload();
        System.out.println(math.add(2, 3));
        System.out.println(math.add(2, 3, 4));
        System.out.println(math.add("The answer is ", 42));
    }
}