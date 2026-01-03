package stepik.easy.ladder;

import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n;i++){
            for(int j = 1;j<i+1;j++){
                System.out.print(j==i ? j +"\n" : j + " ");
            }
        }
    }
}
