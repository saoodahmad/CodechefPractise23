package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConfusingConcatenations {

    static FastReader sc;
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

        sc = new FastReader();

        str = new StringBuilder();

        int ntc = sc.nextInt();

        while(ntc -- > 0) {

            int N = sc.nextInt();

            int [] C = new int[N];

            for (int i = 0; i < N; i++) {
                C[i] = sc.nextInt();
            }

            if(N == 1) {
                str.append(-1).append("\n");
                continue;
            }

            // find if there exists at least one element > A[0], if so then ans exists else not

            boolean ansIsPossible = false;

            for (int i = 1; i < N; i++) {
                if(C[i] > C[0]) {
                    ansIsPossible = true;
                    break;
                }
            }

            if(!ansIsPossible) {
                str.append(-1).append("\n");
                continue;
            }

            String A = C[0] + " ";

            String B = "";

            for (int i = 1; i < N; i++) {
                if(C[i] > C[0] && B.length() == 0) {
                   B += C[i];
                   continue;
                }

                A += C[i] + " ";
            }



            str.append(N - 1).append("\n").append(A).append("\n").append(1).append("\n").append(B).append("\n");


        }

        System.out.println(str.toString());
    }
}
