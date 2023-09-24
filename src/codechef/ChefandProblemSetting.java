package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChefandProblemSetting {

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

            int M = sc.nextInt();


            System.out.println("N " + N + " M " + M);

            boolean inValid = false;

            boolean isWeak = false;

            for(int i =0; i<N; i++) {

                String [] ip = sc.nextLine().split(" ");

                String intent = ip[0];

                int [] m = new int[M];

                int cnt_pass = 0;

                int cnt_fail = 0;

                for(int j =0; j<M; j++) {
                    char c = ip[1].charAt(j);

                    if(c == '1') {
                        cnt_pass++;
                    }else if(c == '0') {
                        cnt_fail++;
                    }
                }

                switch(intent) {
                    case "correct":
                        if(cnt_fail != 0) {
                            inValid = true;
                        }
                        break;
                    case "wrong":
                        if(cnt_fail == 0) {
                            isWeak = true;
                        }
                        break;

                }
            }

            if(inValid) {
                str.append("INVALID").append("\n");
            }else if(isWeak) {
                str.append("WEAK").append("\n");
            }else {
                str.append("FINE").append("\n");
            }
        }

        System.out.println(str.toString());
    }
}
