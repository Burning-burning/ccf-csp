package test201709;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n  = in.nextInt();
        int number = 0;
        while(n>0){
            if(n<30){
                number+=n/10;
                n -= n/10*10;
            }else if(n<50){
                number+=4;
                n -= 30;
            }else {
                number+=7;
                n-=50;
            }
        }
        System.out.println(number);
    }
}
