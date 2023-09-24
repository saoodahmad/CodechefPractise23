package codechef;

import java.util.Scanner;

public class HotelByteland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ntc = sc.nextInt();

        StringBuilder str = new StringBuilder();

        while(ntc -- > 0) {
            int n = sc.nextInt();

            int max= Integer.MIN_VALUE;

            int [] arr = new int[n];

            int [] depart = new int [n];

            for(int i =0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++) {
                depart[i] = sc.nextInt();
            }

            int [] occupancy = new int[1001];

            for(int i = 0; i<n; i++) {
                occupancy[arr[i]]++;
                occupancy[depart[i]]--;
            }

            for(int i =1; i< occupancy.length; i++){
                occupancy[i] = occupancy[i - 1] + occupancy[i];
            }


            for(int i =0; i< occupancy.length; i++) {
                max = Math.max(max, occupancy[i]);
            }

            str.append(max).append("\n");
        }

        System.out.println(str.toString());
    }
}
