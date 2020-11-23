package test201712;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        ArrayDeque arrayDeque = new ArrayDeque();

        for (int i = 0; i<n;i++){
            arrayDeque.offer(i+1);
        }
        int num = 1;

        while (arrayDeque.size()>1){
            int kk = (int)arrayDeque.poll();
            if(!(num%k==0||num%10==k)){
                arrayDeque.offer(kk);
            }
            num++;
        }
        System.out.println(arrayDeque.peek());
    }
}
