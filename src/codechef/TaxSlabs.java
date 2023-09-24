package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TaxSlabs {

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

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int ntc = sc.nextInt();

        StringBuilder str = new StringBuilder();

        while(ntc -- > 0) {
            int N = sc.nextInt();

            long taxReduction = 0L;

            if(N > 250000 ) {
                taxReduction += 0.05 * 1L * (Math.min(N, 500000) - 250000);
            }

            if(N > 500000) {
                taxReduction += 0.10 * 1L *  (Math.min(N, 750000) - 500000);
            }

            if(N > 750000) {
                taxReduction += 0.15 * 1L *  (Math.min(N, 1000000) - 750000);
            }

            if(N > 1000000 ) {
                taxReduction += 0.20 * 1L *  (Math.min(N,1250000) - 1000000);
            }

            if(N > 1250000) {
                taxReduction += 0.25 * 1L *  (Math.min(N, 1500000) - 1250000);
            }

            if(N > 1500000){
                taxReduction += 0.30 * 1L *  (N - 1500000);
            }

            str.append(N - taxReduction).append("\n");
        }

        System.out.println(str.toString());
    }
}
