package Recursion;

import java.util.Scanner;

public class ques1 {

    static int fact(int x,int n)
    {
        if(n==0)
            return 1;
        return x*fact(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fact(x,n));
    }
}
