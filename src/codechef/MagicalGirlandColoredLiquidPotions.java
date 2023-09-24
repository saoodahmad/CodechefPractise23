package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicalGirlandColoredLiquidPotions {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }

        char nextChar() {

            char c = ' ';
            try {
                c = (char) br.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return c;
        }
    }

    public static FastReader sc;
    public static StringBuilder str  ;

    public static void main(String[] args) {


        sc = new FastReader();
        str = new StringBuilder();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {
            solve();
        }

        System.out.println(str.toString());

    }

    private static void solve() {

        int R = sc.nextInt();

        int G = sc.nextInt();

        int B = sc.nextInt();

        int M = sc.nextInt();

        int max_R = Integer.MIN_VALUE;

        int max_G = Integer.MIN_VALUE;

        int max_B = Integer.MIN_VALUE;


        // for R

        for (int i = 0; i < R; i++) {

            int t = sc.nextInt();

            if(t > max_R) {
                max_R = t;
            }
        }

        // for G

        for (int i = 0; i < G; i++) {

            int t = sc.nextInt();

            if(t > max_G) {
                max_G = t;
            }
        }

        // for B

        for (int i = 0; i < B; i++) {

            int t = sc.nextInt();

            if(t > max_B) {
                max_B = t;
            }
        }

        for (int i = 0; i < M; i++) {
            String maxSizePotionType = getMaximumPotionSizeType(max_R, max_G, max_B);

            if(maxSizePotionType == "R") {
                max_R = (int) max_R/2;
            }
            else if(maxSizePotionType == "G") {
                max_G = (int) max_G/2;
            }
            else  {
                max_B = (int) max_B/2;
            }
        }

        str.append(Math.max(Math.max(max_R, max_G), max_B)).append("\n");
    }

    public static String getMaximumPotionSizeType(int size_R, int size_G, int size_B) {

        if(size_R >= size_G) {
            if(size_R >= size_B) {
                    return "R";
            }

            return "B";
        }

        if(size_G >= size_B) {
            return "G";
        }

        return "B";

    }
}
