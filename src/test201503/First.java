package test201503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        String[] lines = line.split(" ");

        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String  number = bufferedReader.readLine();
            String[] numbers = number.split(" ");

            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        for (int i=m-1;i>=0;i--){
            for (int j = 0; j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }


    }
}
