package test201909;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int total = 0;
        int[] q = new int[n];
        for (int i = 0; i<n;i++){
            total+=in.nextInt();
            for (int j = 0; j<m;j++){
                int a = in.nextInt();
                total+=a;
                q[i]-=a;
            }
        }
        int mm = q[0];
        int nn = 1;
        System.out.print(total+" ");
        for (int i = 0; i<n;i++){
            if(mm<q[i]){
                mm=q[i];
                nn=i+1;
            }
        }
        System.out.print(nn+" "+mm);
    }
}
