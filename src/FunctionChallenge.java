public class FunctionChallenge {
    public static void main(String[] args) {
        String res = displayHighScorePosition("ppx",3);
        System.out.println(res);
        int res2 = calculateHighScorePosition(100);
        System.out.println(res2);
    }

    public static String displayHighScorePosition(String name, int position) {
//        return name + " managed to get into position " + position + " on the high score list";
//        or
        return String.format("%s managed to get into position  %d + on the high score list",name, position);
    }

    public static int calculateHighScorePosition(int store) {
        if (store >= 100 && store < 500) {
            return 3;
        } else if (store >= 500 && store < 1000) {
            return 2;
        } else if (store >= 1000) {
            return 1;
        } else {
            return 4;
        }
    }
}
