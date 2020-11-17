package test201509;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int day = in.nextInt();

        if((year%4==0&&year%100!=0)||year%400==0){
            if(day<=31){
                System.out.println(1);
                System.out.println(day);
            }else if(day<=(31+29)){
                System.out.println(2);
                System.out.println(day-31);
            }
            else if(day<=(31+29+31)){
                System.out.println(3);
                System.out.println(day-31-29);
            }
            else if(day<=(31+29+31+30)){
                System.out.println(4);
                System.out.println(day-31-29-31);
            }
            else if(day<=(31+29+31+30+31)){
                System.out.println(5);
                System.out.println(day-31-29-31-30);
            }
            else if(day<=(31+29+31+30+31+30)){
                System.out.println(6);
                System.out.println(day-31-29-31-30-31);
            }
            else if(day<=(31+29+31+30+31+30+31)){
                System.out.println(7);
                System.out.println(day-31-29-31-30-31-30);
            }
            else if(day<=(31+29+31+30+31+30+31+31)){
                System.out.println(8);
                System.out.println(day-31-29-31-30-31-30-31);
            }
            else if(day<=(31+29+31+30+31+30+31+31+30)){
                System.out.println(9);
                System.out.println(day-31-29-31-30-31-30-31-31);
            }
            else if(day<=(31+29+31+30+31+30+31+31+30+31)){
                System.out.println(10);
                System.out.println(day-31-29-31-30-31-30-31-31-30);
            }
            else if(day<=(31+29+31+30+31+30+31+31+30+31+30)){
                System.out.println(11);
                System.out.println(day-31-29-31-30-31-30-31-31-30-31);
            }
            else{
                System.out.println(12);
                System.out.println(day-31-29-31-30-31-30-31-31-30-31-30);
            }

        }else{
            if(day<=31){
                System.out.println(1);
                System.out.println(day);
            }else if(day<=(31+28)){
                System.out.println(2);
                System.out.println(day-31);
            }
            else if(day<=(31+28+31)){
                System.out.println(3);
                System.out.println(day-31-28);
            }
            else if(day<=(31+28+31+30)){
                System.out.println(4);
                System.out.println(day-31-28-31);
            }
            else if(day<=(31+28+31+30+31)){
                System.out.println(5);
                System.out.println(day-31-28-31-30);
            }
            else if(day<=(31+28+31+30+31+30)){
                System.out.println(6);
                System.out.println(day-31-28-31-30-31);
            }
            else if(day<=(31+28+31+30+31+30+31)){
                System.out.println(7);
                System.out.println(day-31-28-31-30-31-30);
            }
            else if(day<=(31+28+31+30+31+30+31+31)){
                System.out.println(8);
                System.out.println(day-31-28-31-30-31-30-31);
            }
            else if(day<=(31+28+31+30+31+30+31+31+30)){
                System.out.println(9);
                System.out.println(day-31-28-31-30-31-30-31-31);
            }
            else if(day<=(31+28+31+30+31+30+31+31+30+31)){
                System.out.println(10);
                System.out.println(day-31-28-31-30-31-30-31-31-30);
            }
            else if(day<=(31+28+31+30+31+30+31+31+30+31+30)){
                System.out.println(11);
                System.out.println(day-31-28-31-30-31-30-31-31-30-31);
            }
            else{
                System.out.println(12);
                System.out.println(day-31-28-31-30-31-30-31-31-30-31-30);
            }

        }
    }
}
