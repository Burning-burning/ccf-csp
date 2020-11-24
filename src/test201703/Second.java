package test201703;


import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 0; i<n;i++){
            list.add(i+1);
        }

        while(m>0){
            int a = in.nextInt();
            int b = in.nextInt();

           int index =  list.indexOf(a);
           list.remove(index);
           list.add(index+b,a);
            m--;
        }
        for (int i = 0; i<n;i++){
            System.out.print(list.get(i)+" ");
        }

    }




}
