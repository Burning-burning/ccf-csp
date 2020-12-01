package test201812;

import java.util.Scanner;

public class Second{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int red = in.nextInt();
       int yellow = in.nextInt();
       int green = in.nextInt();

       int n = in.nextInt();

       long sum = 0;
       long cir = yellow+red+green;
       for (int i = 0; i<n;i++){
           long temp = sum%cir;
           int a = in.nextInt();
           int b = in.nextInt();
           switch (a){
               case 0:
                   sum+=b;
                   break;
               case 1:
                   if (temp<b){
                       sum+=b-temp;
                   }else if (temp>=b+green){
                       sum+=yellow-(temp-b-green)+red;
                   }
                   break;

               case 2:
                   if (temp<b+red){
                       sum+=b+red-temp;
                   }else if (temp>=b+red+green){
                       sum+=red+yellow-(temp-b-red-green);
                   }
                   break;
               case 3:
                   if (temp>=b&&temp<b+red+yellow){
                       sum+=(b+red+yellow)-temp;
                   }
           }

       }
        System.out.println(sum);
    }
}