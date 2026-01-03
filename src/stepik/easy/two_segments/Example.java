package stepik.easy.two_segments;

import java.util.Scanner;
import java.util.Arrays;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0;i < arr.length;i++){
            arr[i]+=sc.nextInt();
        }
        int max = Math.max(arr[0],arr[2]);
        int min = Math.min(arr[1],arr[3]);
        if(max == min){
            System.out.print(max);
        }else if(min > max){
            System.out.print(max + " " +min);
        }else{
            System.out.print("Пересечения нет");
        }
    }
}

