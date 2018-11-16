


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
//                    T[m][n][l] = T[m][n][l - 1] + " + (" + T[m][l - 1][l - 1] + ") * (" + T[l - 1][l - 1][l - 1] + ")^* * (" + T[l - 1][n][l - 1]+")";
                    T[m][n][l] = "(" + T[m][n][l - 1] + " + (" + T[m][l - 1][l - 1] + ") (" + T[l - 1][l - 1][l - 1] + ")^* (" + T[l - 1][n][l - 1] + "))";
                }
            }
        }


        for (int l = 0; l <= k; l++) {
            for (int m = 0; m < i; m++) {
                for (int n = 0; n < j; n++) {
                    System.out.println("A_{" + (m + 1) + ", " + (n + 1) + "}^" + l + ":  " + T[m][n][l]);
                }
            }
        }
    }
}
