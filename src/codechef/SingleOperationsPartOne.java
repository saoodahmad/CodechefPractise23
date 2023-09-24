package codechef;

import com.sun.tools.jconsole.JConsoleContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SingleOperationsPartOne {


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

            int len = sc.nextInt();

            char [] bs = sc.nextLine().toCharArray();

            int pos = 0;

            for (int i = 0; i <bs.length; i++) {
                if(bs[i] != '0') {
                    continue;
                }

                pos = i;
                break;
            }

            if(pos == 0) {

                str.append(len).append("\n");
                continue;
            }
            str.append(pos).append("\n");


        }

        System.out.println(str.toString());
    }
}
