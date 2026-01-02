package stepik.easy.ternary_operator;

import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextFloat() < sc.nextFloat() ? "Бой продолжается!" : "Холифилд - чемпион!" );
    }
}