package test201403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Window> windows = new ArrayList<>();
        for (int i = 0; i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c  = in.nextInt();
            int d = in.nextInt();
            windows.add(new Window(a,b,c,d,i+1));
        }
        for (int i = 0; i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            boolean flag = false;
            for (int j = n-1;j>=0;j--){

                if ((a>=windows.get(j).x1)&&(a<=windows.get(j).y1)&&(b>=windows.get(j).x2)&&(b<=windows.get(j).y2)){
                    System.out.println(windows.get(j).order);
                    Window window = windows.get(j);
                    windows.remove(j);
                    windows.add(window);
                    flag=true;
                    break;

                }
            }
            if (!flag){
                System.out.println("IGNORED");
            }
        }


    }

    public static class Window{
        private int x1;
        private int x2;
        private int y1;
        private int y2;
        private int order;

        public Window(int x1, int x2, int y1, int y2,int order) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.order = order;
        }
    }
}
