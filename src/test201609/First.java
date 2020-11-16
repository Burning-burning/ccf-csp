package test201609;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];
        for (int i = 0; i<n;i++){
            int a = in.nextInt();
            m[i] = a;
        }
        int max = -1;
        for (int i = 1; i<n;i++){
            int a = m[i]-m[i-1];
            if(a<0){
                a=-a;

            }
            if(a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
}
