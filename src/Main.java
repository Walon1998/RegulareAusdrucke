


public class Main {
 
    public static void main(String args[]) {
//        real index: T[i-1][j-1][k]
        int k = 3;
        int i = 3;
        int j = 3;
        String T[][][] = new String[i][j][k + 1];
        T[0][0][0] = "\\lambda";
        T[0][1][0] = "a";
        T[0][2][0] = "b";
        T[1][0][0] = "a";
        T[1][1][0] = "\\lambda";
        T[1][2][0] = "b";
        T[2][0][0] = "b";
        T[2][1][0] = "a";
        T[2][2][0] = "\\lambda";


        T[0][0][1] = "\\lambda";
        T[0][1][1] = "a";
        T[0][2][1] = "b";
        T[1][0][1] = "a";
        T[1][1][1] = "aa";
        T[1][2][1] = "b+ab";
        T[2][0][1] = "b";
        T[2][1][1] = "a+ba";
        T[2][2][1] = "bb";


        T[0][0][2] = "(aa)^*";
        T[0][1][2] = "a+a(aa)^*";
        T[0][2][2] = "b + (a) (aa)^* (b+ab)";
        T[1][0][2] = "a + (aa)^*a";
        T[1][1][2] = "(aa)^*$";
        T[1][2][2] = "b+ab+(aa)^*(a+ab)";
        T[2][0][2] = "b + (a+ba) (aa)^* (a)";
        T[2][1][2] = "a+ba + (a+ba) (aa)^*";
        T[2][2][2] = "bb + (a+ba) (aa)^* (b+ab)";






        for (int l = 3; l <= k; l++) {
            for (int m = 0; m < i; m++) {
                for (int n = 0; n < j; n++) {
//                    T[m][n][l] = T[m][n][l - 1] + " + (" + T[m][l - 1][l - 1] + ") * (" + T[l - 1][l - 1][l - 1] + ")^* * (" + T[l - 1][n][l - 1]+")";
//                    T[m][n][l] = "(" + T[m][n][l - 1] + " + (" + T[m][l - 1][l - 1] + ") (" + T[l - 1][l - 1][l - 1] + ")^* (" + T[l - 1][n][l - 1] + "))";
                    T[m][n][l] =   T[m][n][l - 1] + " + (" + T[m][l - 1][l - 1] + ") (" + T[l - 1][l - 1][l - 1] + ")^* (" + T[l - 1][n][l - 1] + ") = ";
                }
            }
        }


        for (int l = 0; l <= k; l++) {
            for (int m = 0; m < i; m++) {
                for (int n = 0; n < j; n++) {
                    System.out.println("${\\alpha_{" + (m + 1) + ", " + (n + 1) + "}}^{(" + l + ")} =  " + T[m][n][l]+"$\\\\");
                }
            }
        }
    }
}
