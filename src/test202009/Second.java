package test202009;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n  = in.nextInt();
        int k = in.nextInt();
        int t = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int douliu = 0;
        int jingguo = 0;

        while(n>0) {
            int number = 0;
            int max = 0;
            boolean flag = false;
            for(int i = 0; i<t;i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if(a>=x1&&a<=x2&&b>=y1&&b<=y2) {

                    flag = true;
                    number++;
                    if(number>max) {
                        max = number;
                    }
                }
                else {
                    flag = false;
                    number=0;
                }
            }
            if(max>0) {
                jingguo++;
            }
            if(max>=k) {
                douliu++;
            }

            n--;
        }
        System.out.println(jingguo);
        System.out.println(douliu);
    }

}