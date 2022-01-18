package com.company;
import java.util.*;
public class Encoding_Main_String {
    public static void main(String[] args) {
        char[] chars = new char[26];
        int x = 65;
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) (x + i);
//            char ch=(char) (x+i);
//            chars[i]=ch;
        }
        int lengthOfRandomWords=7;
        int lengthOfChars= chars.length;
        Random random=new Random();
        StringBuilder randomString=new StringBuilder(lengthOfRandomWords);
        for(int i=0;i<lengthOfRandomWords;i++){
            randomString.append(chars[random.nextInt(lengthOfChars)]);
        }
        System.out.println(randomString);
    }
}