package test201903;
//由于题中所给出的式子为字符串形式且为多项式，故计算机无法直接解析算式。所以需要设计一种解析算法，这其中最大的难点便是优先级问题。
//        对于该问题，我们可以利用数据结构中的栈来解决，即：我们按照运算符的位置对算式进行扫描，首先判断运算符种类，然后再处理运算符前后的两个数字。
//        对于乘除号我们计算前后两数结果后将结果存储入栈中。对于加减号，我们把前后两数连同符号（作正负数处理）一起存入栈中。最终算式中所有乘除都计算完后，
//        只需把栈中带符号的数字相加即可判断结果是否为二十四。

import java.util.Scanner;
import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        String[] lines = new String[n];
        in.nextLine();
        for (int i = 0; i<n;i++){
            lines[i] = in.nextLine();
        }

        for (int i = 0; i<n;i++){
            Stack<Integer> stack = new Stack<>();
            int result = 0;

            stack.push((lines[i].charAt(0)-'0'));
            for (int j = 1; j<7;j+=2){
                if ((lines[i].charAt(j))=='x'){
                    int m = stack.pop();
                    stack.push(m*(lines[i].charAt(j+1)-'0'));

                }else if (lines[i].charAt(j)=='/'){
                    int m = stack.pop();
                    stack.push(m/(lines[i].charAt(j+1)-'0'));
                }else{
                    stack.push(Integer.parseInt(lines[i].substring(j,j+2)));

                }
            }
            while (stack.size()>0){
                result+=stack.pop();
            }
            if (result==24){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
