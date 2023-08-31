public class SwitchPractice {
    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);

    }

    public static void printNumberInWord(int val) {
        switch (val){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            default -> System.out.println("OTHER");
        }
    }
}
