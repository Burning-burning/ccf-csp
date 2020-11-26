package test201912;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int qq=n;
        List<Traji> list = new ArrayList<>();
        while(qq>0){
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Traji(a,b));
            qq--;
        }
        int q = 0;
        int w=0;
        int e=0;
        int r=0;
        int t=0;
        for (int i = 0; i<n;i++){
            int left = 0;
            int right = 0;
            int top = 0;
            int bottom = 0;
            int one  = 0;
            int two = 0;
            int three=0;
            int four = 0;
            int sum = 0;
            for (int j = 0; j<n;j++){
                if (list.get(j).a==list.get(i).a&&(list.get(j).b==(list.get(i).b-1))){
                    bottom+=1;
                }
                if (list.get(i).a==list.get(j).a&&(list.get(i).b+1)==list.get(j).b){
                    top+=1;
                }
                if (list.get(i).b==list.get(j).b&&list.get(i).a==(list.get(j).a-1)){
                    right+=1;
                }
                if (list.get(i).b==list.get(j).b&&list.get(i).a==(list.get(j).a+1)){
                    left+=1;
                }
                if (list.get(i).a==(list.get(j).a+1)&&(list.get(i).b)==list.get(j).b-1){
                    one+=1;
                }
                if (list.get(i).a==list.get(j).a-1&&list.get(i).b==list.get(j).b-1){
                    two++;
                }
                if (list.get(i).a==list.get(j).a+1&&list.get(i).b==list.get(j).b+1){
                    three++;
                }
                if (list.get(i).a==list.get(j).a-1&&list.get(i).b==list.get(j).b+1){
                    four++;
                }
            }

            if (right==1&&left==1&&bottom==1&&top==1){
                sum+=one+two+three+four;

                if (sum==0){
                    q+=1;

                }else if (sum==1){
                    w+=1;
                }else if (sum==2){
                    e+=1;
                }else if (sum==3){
                    r+=1;
                }else{
                    t+=1;
                }
            }
        }
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
    }
    public static class Traji{
        private int a;
        private int b;

        public Traji(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}