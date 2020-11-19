package test201903;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] m = new int[n];
        for (int i=0; i<n;i++){
            m[i] = in.nextInt();
        }

        if (n%2==1){
            if (m[0]>m[n-1]){
                System.out.print(m[0]+" ");
                System.out.print(m[n/2]+ " "  );
                System.out.print(m[n-1]+" ");
            }else{
                System.out.print(m[n-1]+" ");
                System.out.print(m[n/2]+" ");
                System.out.print(m[0]+" ");
            }


        }else{
            if (m[0]>m[n-1]){
                System.out.print(m[0]+" ");
                int a = m[n/2];
                int b = m[n/2-1];
                if((a+b)%2==0){
                    System.out.print((m[n/2]+m[n/2-1])/2+" ");
                }else{
                    System.out.print((m[n/2]+m[n/2-1])/2.0+" ");
                }

                System.out.print(m[n-1]+" ");
            }else{
                System.out.print(m[n-1]+" ");

                int a = m[n/2];
                int b = m[n/2-1];
                if((a+b)%2==0){
                    System.out.print((m[n/2]+m[n/2-1])/2+" ");
                }else{
                    System.out.print((m[n/2]+m[n/2-1])/2.0+" ");
                }
                System.out.print(m[0]+" ");

            }

        }
    }
}
