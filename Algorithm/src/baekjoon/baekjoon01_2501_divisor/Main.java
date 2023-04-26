package src.baekjoon.baekjoon01_2501_divisor;

import java.util.Scanner;

public class Main {

    public static int getTargetCommonMeasure(int n, int k) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count ++;

                if (count == k) {
                    return i;
                }

            }

        }

        return 0;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(getTargetCommonMeasure(n, k));

    }

}
