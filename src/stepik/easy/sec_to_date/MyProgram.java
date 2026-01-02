package stepik.easy.sec_to_date;

import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        s%=86400;
        int hour = s/3600;
        s %=3600;
        int min = s/60;
        s %=60;
        int sec = s;
        System.out.format("%02d:%02d:%02d",hour,min,sec);
    }
}
