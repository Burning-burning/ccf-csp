package test201512;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int[][] flag = new int[n][m];
        for (int i = 0; i<n;i++){
            for (int j = 0; j<m;j++){
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i<n;i++){
            for (int j = 0; j<m;j++){

                if(i+1<n&&i+2<n){
                    if(a[i][j]==a[i+1][j]&&a[i][j]==a[i+2][j]){
                        flag[i][j]=-1;
                        flag[i+1][j]=-1;
                        flag[i+2][j]=-1;
                    }
                }
                if(j+1<m&&j+2<m){
                    if(a[i][j]==a[i][j+1]&&a[i][j]==a[i][j+2]){
                        flag[i][j]=-1;
                        flag[i][j+1]=-1;
                        flag[i][j+2]=-1;
                    }
                }
            }
        }
        for (int i = 0;i<n;i++){
            for (int j = 0; j<m;j++){
                if (flag[i][j]==-1){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
