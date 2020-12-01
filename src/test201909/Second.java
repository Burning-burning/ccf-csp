package test201909;
import java.util.Scanner;

public class Second{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int[] r = new int[n];
        int qq=0;
        for (int t = 0; t<n;t++){
            int m = in.nextInt();
            int number = 0;
            int a = in.nextInt();
            number += a;
            for (int i = 1; i < m; i++){
                int q = in.nextInt();
                if (q > 0){
                    if (number > q){
                        r[t] = 1;
                        number = q;

                    }else{
                        number=q;
                    }
                }else{
                    number += q;
                }
            }
            sum += number;
        }
        int s = 0;
        if (n==3){
            if (r[0]==1&&r[1]==1&r[2]==1){
                s++;
            }
        }
       if (n > 3){
           for (int i = 1;i < n-1;i++){
               if (r[i] == 1&&r[i] == r[i-1]&&r[i] == r[i+1]){
                   s++;
               }
           }
           if (r[0] == 1&&r[n-1] == 1&&r[n-2] == 1){
               s++;
           }
           if (r[0] == 1&&r[n-1] == 1&&r[1] == 1){
               s++;
           }
       }
       for (int i = 0; i < n; i++){
           if (r[i] == 1){
               qq++;
           }
       }
        System.out.println(sum + " " + qq + " " + s);
    }
}
