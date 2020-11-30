package test201312;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        int max = 0;
        for (int i = 0; i<n;i++){

            m[i] = in.nextInt();
            if (max<m[i]){
                max = m[i];
            }
        }
        for (int i = 0; i<n;i++){

        }
    }
}
