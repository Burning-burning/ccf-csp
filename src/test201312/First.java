package test201312;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[10001];
        for (int i = 0; i<n;i++){

            int a = in.nextInt();
            m[a]++;
        }
        int max = m[0];
        int number = 0;
        for (int i = 0; i<10001;i++){
            if(m[i]>max){
                max = m[i];
                number = i;
            }
        }
        System.out.println(number);
    }
}
