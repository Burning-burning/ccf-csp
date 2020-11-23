package test201803;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int L = in.nextInt();
        int t = in.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i<n;i++){
           m[i][0] = in.nextInt();
           m[i][1]=1;
        }

        for (int i = 0; i<t;i++){
            for (int j = 0; j<n;j++){
                if (m[j][1]==1){
                    m[j][0]++;
                    if (m[j][0]==L){
                        m[j][1]=-1;
                    }
                }else{
                    m[j][0]--;
                    if (m[j][0]==0){
                        m[j][1]=1;
                    }
                }
            }
            for (int q = 0; q<n-1;q++){
                for (int w=q+1; w<n;w++){
                    if (m[q][0]==m[w][0]){
                        m[q][1]=-m[q][1];
                        m[w][1]=-m[w][1];
                    }
                }
            }

        }
        for (int i = 0; i<n;i++){
            System.out.print(m[i][0]+" ");
        }

    }
}
