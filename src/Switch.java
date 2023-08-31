public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;
//        switch(switchValue){
//            case 1:
//                System.out.println("Value is 1");
//                break;
//            case 2:
//                System.out.println("Value is 2");
//                break;
//                // 这个地方 js 也是可以的
//            case 3: case 4: case 5:
//                System.out.println("Value is 3 or 4 or 5");
//                break;
//            default:
//                System.out.println("Was not 1,2,3,4,5");
//                break;
//        }

//        使用 增强版 的 switch case
        switch(switchValue){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3,4,5 -> System.out.println("Value is 3 or 4 or 5");
            default -> System.out.println("Was not 1,2,3,4,5");
        }
    }
}
