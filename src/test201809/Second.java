package test201809;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[1000001];
        int[] b = new int[1000001];

        for (int i = 0; i<n;i++){

            int q = in.nextInt();
            int w = in.nextInt();


            for (int j = q; j<w;j++){

                a[j] =1;


            }
        }

        for (int i = 0; i<n;i++){
            int q = in.nextInt();
            int w = in.nextInt();


            for (int j = q; j<w;j++){
                b[j] =1;

            }
        }
        int sum = 0;
        for (int i = 0; i<1000001;i++){
            if(a[i]==1&&a[i]==b[i]){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
