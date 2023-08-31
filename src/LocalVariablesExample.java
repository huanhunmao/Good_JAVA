public class LocalVariablesExample {
    public static void main(String[] args) {
        int x = 6; // outer scope variable

        if(x > 0){
            int y = 100;
            System.out.println("y is " + y);
        }

        for(int i = 0; i < 5; i ++){ // i is local variable value
            System.out.println("i is " + i);
        }

        System.out.println("x is " + x); // can work

//        System.out.println("i is " + i); // error
    }
}
