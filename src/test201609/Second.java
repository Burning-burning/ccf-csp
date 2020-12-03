package test201609;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        int[] record = new int[100];

        for (int i = 0; i<n;i++){
            m[i] = in.nextInt();
        }
        for (int i = 0; i<n;i++){
            int a = m[i];
            boolean flag = false;
            for (int j = 0; j<20;j++){
                for (int k = 0; k<5;k++){
                    if (record[j*5+k]==0&&a+k<=5){
                        for (int l = j*5+k;l<j*5+k+a;l++){
                            record[l] = i+1;
                            flag = true;
                        }
                    }
                    if (flag){
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
            if (!flag){
                while (a>0){
                    for (int s = 0; s<100;s++){
                        if (record[s]==0){
                            record[s]=i+1;
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i<n;i++){
            for (int j = 0; j<100;j++){
                if (record[j]==i+1){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
