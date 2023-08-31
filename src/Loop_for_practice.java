public class Loop_for_practice {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for(int i = 1; count < 5 && i <= 1000; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Good value is  " + i);
                count++;
                sum =  sum + i;
            }
        }

        System.out.println("Total value is  " + sum);
    }
}
