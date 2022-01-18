package com.company;
import java.util.*;
class RandomWords{
    int length;
    String [] words=new  String[10];

    public void setWords(String[] words,int length) {
        this.words = words;
        Random random=new Random();
        StringBuilder randomString=new StringBuilder();
        for(int i=0;i<length;i++){
            randomString.append(words[random.nextInt(words.length)]);
        }
        System.out.println("I Love You "+randomString);
    }
    public void setWords1(String[] words,int length) {
        this.words = words;
        Random random=new Random();
        StringBuilder randomString=new StringBuilder();
        for(int i=0;i<length;i++){
            randomString.append(words[random.nextInt(words.length)]);
        }
//        System.out.println("I Love You "+randomString);
        System.out.println("Will You Marry Me "+randomString+"?");

    }

}
public class Create_Random_Words {
    public static void main(String[] args) {
     Random random=new Random();
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter Your Length of the String (1) you want to Generate");
     int lengthOfRandomWords;
     lengthOfRandomWords=scanner.nextInt();
     RandomWords randomWords=new RandomWords();
     String [] chars={"Snigdha","Kuttus","Rainbow","Baby","Babu","Jaan"};
     //     int x=48;
//     for(int i=0;i<75;i++){
//         chars[i]=(char) (x+i);
//     }
     randomWords.setWords(chars,lengthOfRandomWords);
     randomWords.setWords1(chars,lengthOfRandomWords);


    }
}
//same program will run  for any strings or any characters array