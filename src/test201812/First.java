package test201812;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int red = in.nextInt();
        int yellow = in.nextInt();
        int green = in.nextInt();

        int n = in.nextInt();
        int sum = 0;
        while(n>0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a ==0) {
                sum+=b;
            }else if(a==1) {
                sum+=b;
            }else if(a==2) {
                sum+=b+red;
            }else{
                sum+=0;
            }


            n--;
        }
        System.out.println(sum);

    }

}