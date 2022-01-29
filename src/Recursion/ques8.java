package Recursion;

import java.util.Scanner;

public class ques8 {
    static String remove(int i,String st)
    {
        if(i+1==st.length())
            return st.charAt(st.length()-1)+remove(i+1,st);
        if(i==st.length())
            return "";
        if(st.charAt(i+1)==st.charAt(i))
            return st.charAt(i)+remove(i+2,st);
        return st.charAt(i)+remove(i+1,st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(remove(0,st));
    }
}
