package test201712;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];

        for (int i = 0; i<n;i++){
            m[i] = in.nextInt();
        }

        int number = 100000;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n;j++){
                int a = m[i]-m[j];

                if(a<0){
                    a=-a;
                }
                if(a<number){
                    number=a;

                }
            }
        }
        System.out.println(number);
    }
}
