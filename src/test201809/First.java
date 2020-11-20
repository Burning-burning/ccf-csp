package test201809;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        for(int i = 0; i<n;i++) {
            m[i] = in.nextInt();
        }

        int[] a = new int[n];
        a[0] = (m[0]+m[1])/2;
        System.out.print(a[0]+" ");
        a[n-1]=(m[n-2]+m[n-1])/2;
        for(int i = 1;i<n-1;i++) {
            a[i] = (m[i-1]+m[i]+m[i+1])/3;
            System.out.print(a[i]+" ");
        }
        System.out.print(a[n-1]);

    }

}