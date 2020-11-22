package test201912;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int i = 1;

        while(n>0){
            if(i%7==0||(i+"").contains("7")){
                n++;
                if(i%4==1){
                    a++;
                }else if(i%4==2){
                    b++;
                }else if(i%4==3){
                    c++;
                }else {
                    d++;
                }
            }
            n--;
            i++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
