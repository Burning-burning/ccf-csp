package test201312;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();
        String[] number = n.split("-");

        int sum = 0;
        sum+=Integer.parseInt(number[0]);
        String[] a = number[1].split("");
        sum+=Integer.parseInt(a[0])*2;
        sum+=Integer.parseInt(a[1])*3;
        sum+=Integer.parseInt(a[2])*4;
        String[] b = number[2].split("");
        sum+=Integer.parseInt(b[0])*5;
        sum+=Integer.parseInt(b[1])*6;
        sum+=Integer.parseInt(b[2])*7;
        sum+=Integer.parseInt(b[3])*8;
        sum+=Integer.parseInt(b[4])*9;

        if (sum%11==10){
            if(number[3].equals("X")){
                System.out.println("Right");
            }else{

                    String h = number[0]+'-'+number[1]+'-'+number[2]+'-'+"X";
                    System.out.println(h);

            }
        }else{
            if(number[3].equals("X")){

                String h = number[0]+'-'+number[1]+'-'+number[2]+'-'+(sum%11);
                System.out.println(h);
            }
            else {

                if(sum%11==Integer.parseInt(number[3])){
                    System.out.println("Right");
                }else{
                    String h = number[0]+'-'+number[1]+'-'+number[2]+'-'+(sum%11);
                    System.out.println(h);
                }
            }
        }



    }
}
