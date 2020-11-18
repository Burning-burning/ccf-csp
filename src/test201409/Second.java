package test201409;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum[][] = new int[101][101];
        while (n>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            for (int i = a;i<c;i++){
                for (int j = b;j<d;j++){
                    if (sum[i][j]==0){
                        sum[i][j]=1;
                    }
                }
            }
            n--;
        }
        int number = 0;
        for (int i = 0; i<101;i++){
            for (int j = 0; j<101;j++){
                if (sum[i][j]==1){
                    number++;
                }
            }
        }
        System.out.println(number);
    }
}
