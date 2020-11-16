package test201503;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int n =in.nextInt();
        int[] m = new int[1001];
        int number = 0;
        for (int i = 0 ; i<n;i++){
           int a = in.nextInt();
           if(m[a]==0){
               number++;
           }
           m[a]++;
        }

        while(number>0){
            int max = -1;
            int kk = 0;
            for (int i= 0;i<1001;i++){
                if (m[i]>max){
                    max = m[i];
                    kk = i;
                }
            }
            System.out.println(kk + " " +max);
            m[kk] = 0;
            number--;
        }


    }

}
