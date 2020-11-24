package test202006;


import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] AX = new int[n];
        int[] AY = new int[n];
        int[] BX = new int[n];
        int[] BY = new int[n];
        int counta  = 0;
        int countb = 0;
        for(int i = 0; i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            String c = in.next();

            if(c.contains("A")){
                AX[counta] = a;
                AY[counta] = b;
                counta++;
            }else{
                BX[countb] = a;
                BY[countb] = b;
                countb++;
            }
        }
        int flaga = 0;
        int flagb = 0;
        for (int i = 0; i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            for (int j = 0; j < counta; j++){
                int q = a + b*AX[j] + c*AY[j];
                if (q > 0){
                    flaga++;
                }
            }
            for (int j = 0; j<countb;j++){
                int q = a + b*BX[j] + c*BY[j];
                if (q > 0){
                    flagb++;
                }

            }
            if (flaga == counta&&flagb == 0){
                System.out.println("Yes");
            }else if (flaga == 0&&flagb == countb){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            flaga = 0;
            flagb = 0;
        }
    }
}
