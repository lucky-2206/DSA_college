package Recursion;

import java.util.Scanner;

public class ques2 {

    static void print(int n)
    {
        if(n==0)
            return;
        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
