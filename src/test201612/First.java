package test201612;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] m = new int[n];

        for (int i = 0; i<n;i++){
            m[i] = in.nextInt();
        }
        Arrays.sort(m);
        if (n==1){
            System.out.println(m[0]);
        }else if(n==2){
            if(m[0]==m[1]){
                System.out.println(m[0]);
            }else{
                System.out.println(-1);
            }
        }else{
            if (n%2==0){
                if (m[n/2]!=m[n/2-1]){
                    System.out.println(-1);
                }else{
                    int a = m[n/2];
                    int min = 0;
                    int max = 0;
                    for (int i = 0; i<n;i++){
                        if(m[i]>a){
                            max++;
                        }
                        if(m[i]<a){
                            min++;
                        }
                    }
                    if (min==max&&min!=0){
                        System.out.println(m[n/2]);
                    }else{
                        System.out.println(-1);
                    }
                }

            }else{

                int a = m[n/2];
                int min = 0;
                int max = 0;
                for (int i = 0; i<n;i++){
                    if(m[i]>a){
                        max++;
                    }
                    if(m[i]<a){
                        min++;
                    }
                }
                if (min==max&&min!=0){
                    System.out.println(m[n/2]);
                }else{
                    System.out.println(-1);
                }
            }

        }



    }
}
