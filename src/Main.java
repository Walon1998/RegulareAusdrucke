public class Main {
    public static void main(String args[]) {
        int k = 2;
        int i = 2;
        int j = 2;
        String T[][][] = new String[i][j][k + 1];
        T[0][0][0] = "1+\\lambda";
        T[0][1][0] = "0";
        T[1][0][0] = "\\emptyset";
        T[1][1][0] = "0+1+\\lambda";


        for (int l = 1; l <= k; l++) {
            for (int m = 0; m < i; m++) {
                for (int n = 0; n < j; n++) {
                    T[i][j][k] = T[i][j][k - 1] + " + " + T[i][k - 1][k - 1] + "*" + T[k - 1][k - 1][k - 1] + "^* *" + T[k - 1][j][k - 1];
                }
            }
        }
        System.out.print(T[i - 1][j - 1][k]);
    }
}
