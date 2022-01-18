package com.company;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = "";
        String a=sc.nextLine();
        char[] name1 = {'M', 'i', 'n', 'h'};
        //  System.out.println(name.charAt(1)); print: i;
        //    System.out.println(name.codePointAt(1));
        int size = name.length();
        //  System.out.println(name.codePointBefore(size));
        //   System.out.println(name.codePointCount(0,size-1));
        // System.out.println(name.compareTo("Minhaz"));
        //System.out.println(name.compareToIgnoreCase("MINHAZ"));
        //CharSequence name2='m';
        //System.out.println(name.contains("i"));
        /*System.out.println(name.contentEquals("Minhaz"));
        puro String mille then output true dibe otherwise false
         */
        // System.out.println(name.contentEquals("M"));
        // String name2=name.copyValueOf(name1);
        //System.out.println(name2);
        // String name3=name.copyValueOf(name1,0,3);
        //System.out.println(name3);
        char a[];
        for(int i=0;i<5;i++){
            char b;
            b=sc.next().charAt(i);
            a[i]=b;

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }
}
