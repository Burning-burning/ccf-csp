package test201604;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];

        for (int i =0;i<n;i++){
            m[i] = in.nextInt();
        }

        int number = 0;
        for (int i =1; i<n-1;i++){
            if((m[i-1]-m[i])*(m[i]-m[i+1])<0){
                number++;
            }
        }
        System.out.println(number);
    }
}
