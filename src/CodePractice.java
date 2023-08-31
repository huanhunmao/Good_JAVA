
//Positive, Negative or Zero
//        Write a method called checkNumber with an int parameter number.
//        The method should not return any value, and it needs to print out:
//        * "positive" if the parameter number is > 0
//        * "negative" if the parameter number is < 0
//        * "zero" if the parameter number is equal to 0

public class CodePractice {
    public static void main(String[] args) {
        String res = checkCode(0);
        System.out.println(res);

    }
    public static String checkCode(int val) {
        if(val > 0){
            return  "positive";
        }else if(val < 0){
            return "negative";
        }else {
            return "zero";
        }
    }
}
