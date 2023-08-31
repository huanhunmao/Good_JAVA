public class Loop {
    public static void main(String[] args) {
//        for 最基础版本
//        for(int i = 0; i < 10; i ++){
//            System.out.println("Value of i: " + i);
//        }

//        System.out.println(isPrime(1));
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(11));
//        System.out.println(isPrime(17));
//        System.out.println(isPrime(20));
//        System.out.println(isPrime(30));

        foundPrime();
    }
    // 练习 找质数（1和它本身因数）
    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

//        如果一个数有一个大于它平方根的因子，那么它一定也有一个小于它平方根的因子，所以只需要检查平方根之前的因子就可以了，这样可以减少不必要的计算
        for(int disvisor = 2; disvisor <= Math.sqrt(num); disvisor++){
            if(num % disvisor == 0){
                return false;
            }
        }

        return true;
    }

    //        找找 大于 10 小于 50 的 质数  只找出 3个 可在 for循环加 或者 if(count < 3) break;
    public static void foundPrime() {
        int count = 0;

        for(int i = 10; count < 3 && i <= 50; i ++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("The total count is " + count);
    }

}
