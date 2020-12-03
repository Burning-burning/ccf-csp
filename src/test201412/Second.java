package test201412;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                m[i][j] = in.nextInt();
            }
        }

        int a = 0;
        int b = 0;
        boolean flag = false;
        while (a<n && b<n){
            System.out.print(m[a][b]+" ");
            if(a==n-1 && flag){
                b++;
                if (b>n-1){
                    break;
                }
                flag = !flag;
                System.out.print(m[a][b]+" ");

            }else if (b==n-1 && !flag){
                a++;
                if (a>n-1){
                    break;
                }
                System.out.print(m[a][b]+" ");
                flag = !flag;

            }else if (a==0 && !flag){
                b++;
                System.out.print(m[a][b]+" ");
                flag = !flag;
            }else if (b==0 && flag){
                a++;
                System.out.print(m[a][b]+" ");
                flag = !flag;
            }
            if (flag){
                a++;
                b--;
            }else{
                a--;
                b++;
            }
        }
    }
}
