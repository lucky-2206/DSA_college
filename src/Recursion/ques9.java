package Recursion;

import java.util.Scanner;

public class ques9 {
    static int convert(int i,String st,int num)
    {
        if(i==st.length())
            return num;
        int x = st.charAt(i)-48;
        return convert(i+1,st,num*10+x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(convert(0,st,0));
    }
}
