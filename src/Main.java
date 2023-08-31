// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       java 多段 也可以连上 一个分号表示结束
        int myVar = 666;
        boolean isTrues = true;
//        函数调用
        caculateNum();
        System.out.println(myVar);
        funcArgsType(isTrues,myVar);

        int value = hasReturnValue(999);
        System.out.println(value);

    }

    public static void caculateNum() {
        System.out.println("caculateNum123");
    }

    public static void funcArgsType(boolean isTrue, int myVarTest) {
        System.out.println(isTrue);
        System.out.println(myVarTest);

    }

//    有返回的
public static int  hasReturnValue(int val) {
    return val * 2;
}
}