package chapter03;

import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {

        int total = 0;

        total -= 900 * 10;
        total += 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500 * 1;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.printf("오늘 총매출액은 %d원 입니다.\n", total);

    }
}
