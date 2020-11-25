package test202006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int a = Integer.parseInt(line[1]);
        int b = Integer.parseInt(line[2]);


        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < a; i++){
            String[] mm = bufferedReader.readLine().split(" ");
            int q = Integer.parseInt(mm[0]);
            int w = Integer.parseInt(mm[1]);
            map.put(q,w);
        }
        long sum  = 0;
        for (int i = 0; i<b;i++){
            String[] nn = bufferedReader.readLine().split(" ");
            int q = Integer.parseInt(nn[0]);
            int w = Integer.parseInt(nn[1]);
            if (map.containsKey(q)){
                sum += map.get(q) * w;
            }
        }
        System.out.println(sum);
    }
}
