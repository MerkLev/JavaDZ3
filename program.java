import java.util.Scanner;
public class program{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите введите ширину массива: ");
    int m = sc.nextInt();
    System.out.print("Введите введите длину массива: ");
    int n = sc.nextInt();
    System.out.println(uniquepath(m, n));
}		 

    public static int uniquepath(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] Array = new int[m][n];
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                Array[i][j] = getpath(Array, i, j);
            }
        }
        return Array[0][0];
    }
    public static int getpath(int[][] Array, int i, int j) {
        if (i >= Array.length - 1 || j >= Array[0].length - 1) {
            return 1;
        }
        return Array[i][j + 1] + Array[i + 1][j];
    }
}