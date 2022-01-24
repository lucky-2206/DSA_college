package Recursion;

import java.util.Scanner;

public class ques3 {

    static int calc(int n) {
        if(n==0)
            return 0;
        return 1+calc(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n));
    }
}
