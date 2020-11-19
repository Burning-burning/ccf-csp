package test201803;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int sum = 0;
        boolean flag = false;
        int hh  =0;
        while(a>0){
            if (a==1){
                flag = false;
                hh=0;
                sum+=1;
            }else if (a==2){
                if (flag==false){
                    sum+=2;
                    hh=2;
                    flag=true;
                }
                else{
                    hh+=2;
                    sum+=hh;
                }
            }
            a=in.nextInt();

        }
        System.out.println(sum);
    }
}
