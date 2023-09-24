package codechef;

import java.io.*;
import java.util.*;

public class WATestCases {

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

    public static void solve() {

        int N = sc.nextInt();

        int [] size_tc = new int[N];

        for (int i = 0; i < N; i++) {
            size_tc[i] = sc.nextInt();
        }


        String v = sc.nextLine();

        int leastTestCaseSize = Integer.MAX_VALUE;

        for (int i = 0; i < v.length(); i++) {
            if(v.charAt(i) != '0') {
                continue;
            }
            int testCaseSize  = size_tc[i];

            if(testCaseSize < leastTestCaseSize) {
                leastTestCaseSize = testCaseSize;
            }

        }


        str.append(leastTestCaseSize).append("\n");

    }
}
