package test201409;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int n = in.nextInt();
        int m = in.nextInt();

        while(m>0){
            String mm = in.next();
            if(n==1){
                if (mm.contains(str)){
                    System.out.println(mm);
                }
            }else{
                if(mm.toUpperCase().contains(str.toUpperCase())){
                    System.out.println(mm);
                }
            }


            m--;
        }
    }
}
