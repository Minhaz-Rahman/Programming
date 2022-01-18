package com.company;

import java.util.*;

class GamePlay {
    private int randomNumberPaisi;
    private int computerNumber;
    private boolean logic;
    private int numberOfGuesses;

    public void setRandomNumberPaisi(int x, int y, boolean z) {
        randomNumberPaisi = x;
        computerNumber = y;
        logic = z;
        if(randomNumberPaisi>computerNumber){
            logic=false;
            System.out.println("Your Number is greater than random Number ");
            numberOfGuesses++;
        }
        else if(randomNumberPaisi<computerNumber){
            logic=false;
            System.out.println("Your Number is smaller than random Number ");
            numberOfGuesses++;
        }
        else {
            numberOfGuesses++;
            logic=true;
            System.out.println("Your Guess is correct and total guesses is "+numberOfGuesses);
            System.out.println("Congrats You Have Won The Game ");
        }

    }

    public boolean isLogic() {
        return logic;
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        GamePlay gamePlay = new GamePlay();
        boolean milse = false;
        while (!milse) {
            System.out.println("please Enter Your guess number");
            int playerGuessNumber = sc.nextInt();
            gamePlay.setRandomNumberPaisi(playerGuessNumber, randomNumber, milse);
            milse= gamePlay.isLogic();
        }

    }
}
