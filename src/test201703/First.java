package test201703;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();


        int sum = 0;
        int number = 0;
        for (int i = 0; i<n;i++){
            int a = in.nextInt();

            sum+=a;
            if (sum>=k){
                sum=0;
                number++;
            }
        }
        if(sum>0){
            number++;
        }
        System.out.println(number);
    }
}
