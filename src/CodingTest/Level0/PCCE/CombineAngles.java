package CodingTest.Level0.PCCE;

import java.util.Scanner;

public class CombineAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        sum_angle = sum_angle % 360; // 추가
        System.out.println(sum_angle);
    }
}
