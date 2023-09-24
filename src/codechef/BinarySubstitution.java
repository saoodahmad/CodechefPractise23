package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySubstitution {

    static FastReader sc;
    static StringBuilder str;

    static long [] aux;
    static final long MOD = 998244353L;

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

            char [] bs = sc.nextLine().toCharArray();

            aux = new long[bs.length];
            Arrays.fill(aux, -1);
            str.append(ways(0, bs)).append("\n");
        }

        System.out.println(str.toString());
    }


    public static long ways(int currentPointer, char [] s) {

//        System.out.println("current pointer " + currentPointer);
        if(currentPointer >= s.length - 1) {
            return 1L;
        }

        if(aux[currentPointer] != -1) {
//            System.out.println("result already found " + aux[currentPointer]);
            return aux[currentPointer];
        }

        // check if two ways are possible

        if(s[currentPointer] == 'a' && s[currentPointer + 1] == 'b')
        {

            aux[currentPointer] = ( ways(currentPointer + 2, s) % MOD
                    + ways(currentPointer + 1, s) % MOD) %MOD;
            return aux[currentPointer];
            // two ways are possible
        }

        if(s[currentPointer] == 'b' && s[currentPointer + 1] == 'a')
        {
            // two ways are possible

            aux[currentPointer] = (ways(currentPointer + 2, s) % MOD
                    + ways(currentPointer + 1, s) % MOD) % MOD;

            return aux[currentPointer];
        }

        aux[currentPointer] = ways(currentPointer + 1, s) % MOD;

        return aux[currentPointer];
    }
}
