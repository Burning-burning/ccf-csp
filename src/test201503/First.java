package test201503;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i<n;i++){
            for (int j = 0;j<m;j++){
                A[i][j] = in.nextInt();
            }
        }
        for (int i = m-1;i>=0;i--){
            for (int j=0;j<n;j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }
}
