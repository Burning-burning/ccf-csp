package test202009;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int[] m = new int[n];

        for(int i = 0;i<n;i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int k = (a-x)*(a-x)+(b-y)*(b-y);

            m[i] = k;
        }
        int number =Integer.MAX_VALUE;
        int q = 3;
        int p = 0;
        while(q>0) {
            number = Integer.MAX_VALUE;
            p = 0;
            for(int i =0; i<n;i++) {
                if(m[i]<number) {
                    number = m[i];
                    p = i+1;
                }
            }
            System.out.println(p);
            m[p-1] = Integer.MAX_VALUE;
            q--;
        }

    }

}