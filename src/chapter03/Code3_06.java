package chapter03;

import java.util.Scanner;

public class Code3_06  {
    public static void main(String[] args) {
        double lb = 0.4535923;
        double Kg = 2.204623;
        Scanner s = new Scanner(System.in);

        System.out.print("파운드(lb)를 입력하세요: ");
        int num1 = s.nextInt();
        double result =  num1 * lb;
        System.out.printf("%d 파운드(lb)는 %.3f Kg 입니다.", num1, result);

        System.out.print("킬로그램(Kg)을 입력하세요: ");
        int num2 = s.nextInt();
        double result2 = num2 * Kg;
        System.out.printf("%d Kg은 %.3f 파운드(lb) 입니다.", num2, result2);


        s.close();
    }
}
