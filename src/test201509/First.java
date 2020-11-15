package test201509;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];
        int number=1;
        m[0] = in.nextInt();
        for (int i = 1; i<n;i++){
            int a  = in.nextInt();
            m[i] = a;
            if(a!=m[i-1]){
                number++;
            }
        }
        System.out.println(number);
    }
}
