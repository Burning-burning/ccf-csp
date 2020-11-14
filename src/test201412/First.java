package test201412;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[1001];

        for (int i = 0; i<n;i++){
            int a = in.nextInt();
            m[a]++;
            System.out.print(m[a]+" ");
        }
    }
}
