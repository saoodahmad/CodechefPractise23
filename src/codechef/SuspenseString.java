package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SuspenseString {


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

            char s [] = sc.nextLine().toCharArray();

            int front = 0, end = N - 1;

            String ans = "";

            int flag = 0;

            while(front <= end) {

                if(flag == 0)
                {


                    if(s[front] == '0') {
                        ans = s[front] + ans;
                    }else {
                        ans += s[front] ;
                    }

                    front++;
                    flag = 1;
                }else {

                    if(s[end] == '1') {
                        ans = s[end] + ans;
                    }else {
                        ans += s[end] ;
                    }

                    end--;
                    flag = 0;
                }
            }

            str.append(ans).append("\n");

        }

        System.out.println(str.toString());

    }
}
