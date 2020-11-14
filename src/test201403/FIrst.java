package test201403;

import java.util.Scanner;

public class FIrst {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];
        for (int i = 0; i<n;i++){
            int a = in.nextInt();
            m[i] = a;
        }
        int number = 0;

        for (int i = 0; i<n-1;i++){
            for (int j = i+1;j<n;j++){
                if ((m[i]+m[j]==0)&&m[i]!=0&&m[j]!=0){
                    m[i] =0;
                    m[j] =0;
                    number++;

                }
            }
        }
        System.out.println(number);
    }
}
