package stepik.easy.three_words_split;

import java.util.Scanner;
import java.util.*;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        Arrays.sort(arr);
        for (String item : arr) System.out.println(item);
    }
}