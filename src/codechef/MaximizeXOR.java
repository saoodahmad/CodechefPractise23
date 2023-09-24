package codechef;

import java.io.*;
import java.util.*;

public class MaximizeXOR {

    static Template.FastReader sc;
    static StringBuilder str;
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

        StringBuilder str = new StringBuilder();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {

            String A = sc.nextLine();

            String B = sc.nextLine();

            int cnt_0_A = 0;
            int cnt_1_A = 0;

            int cnt_0_B = 0;
            int cnt_1_B = 0;

            for(int i =0; i<A.length(); i++) {
                if(A.charAt(i) == '0') {
                    cnt_0_A++;
                    continue;
                }

                cnt_1_A++;
            }

            for(int i =0; i<B.length(); i++) {
                if(B.charAt(i) == '0') {
                    cnt_0_B++;
                    continue;
                }

                cnt_1_B++;
            }


            int noOfOnesInRes = 0;

            int noOfZerosInRes = 0;

            // O of A with 1 of B

            noOfOnesInRes += Math.min(cnt_0_A, cnt_1_B);

            cnt_0_A -= Math.min(cnt_0_A, cnt_1_B);

            cnt_1_B -= Math.min(cnt_0_A, cnt_1_B);

            // 1 of A with 0 of B
            noOfOnesInRes += Math.min(cnt_1_A, cnt_0_B);

            cnt_1_A -= Math.min(cnt_1_A, cnt_0_B);

            cnt_0_B -= Math.min(cnt_1_A, cnt_0_B);


            // 1 of A with 1 of B

            noOfZerosInRes += Math.min(cnt_1_A, cnt_1_B);

            cnt_1_A -= Math.min(cnt_1_A, cnt_1_B);

            cnt_1_B -= Math.min(cnt_1_A, cnt_1_B);

            // 0 of A with 0 of B
            noOfZerosInRes += Math.min(cnt_0_A, cnt_0_B);

            cnt_0_A -= Math.min(cnt_0_A, cnt_0_B);

            cnt_0_B -= Math.min(cnt_0_A, cnt_0_B);


            for(int i =0; i<noOfOnesInRes; i++) {
                str.append(1);
            }


            for(int i =0; i<noOfZerosInRes; i++) {
                str.append(0);
            }

            str.append("\n");
        }

        System.out.println(str.toString());
    }
}
