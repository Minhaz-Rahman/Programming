package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    int player1;
    int computer;
    int playerCount = 0;
    int computerCount = 0;
    int draw = 0;

    public Game() {

    }

    public Game(int p, int c) {
        player1 = p;
        computer = c;
        if (player1 == computer) {
            draw++;
            System.out.println("Match issssss draw ");
        } else if (player1 == 1 && computer == 3 || player1 == 2 && computer == 1 || player1 == 3 && computer == 2) {
            playerCount++;
            System.out.println("Player 1 has won the game ");
        } else {
            computerCount++;
            System.out.println("Computer has won the game ");
        }

    }


    public int getPlayerCount() {

        return playerCount;

    }

    public int getComputerCount() {
        return computerCount;
    }

    public int getDraw() {
        return draw;
    }
}
//main function start from here


public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please chose ur Option:" +
                " 1=Rock,2=Paper,3=Scissor ");
        Random random = new Random();
        int x = 5;
        while (x != 0) {
            int player = sc.nextInt();
            System.out.println("Player1 has chose " + player);
            int computerInput = random.nextInt(3) + 1;
            System.out.println("computer has chose " + computerInput);
            Game game = new Game(player, computerInput);
            x--;
        }
        Game game2 = new Game(1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Game game1 = new Game();
        System.out.println("Final result of player 1 is " + game2.getPlayerCount());
        System.out.println("Final result of Computer  is " + game2.getComputerCount());
        System.out.println("Final result of the draw is " + game2.getDraw());
//        if(game2.getPlayer()> game2.getComputer()){
//            System.out.println("Player1 has won "+game2.getPlayer()+" game ,so winner is player1 ");
//            System.out.println("Total draw is "+game2.getDraw1());
//        }
//        else if(game2.getPlayer()< game2.getComputer()){
//            System.out.println("computer has won "+game2.getComputer()+" game, so winner is computer ");
//            System.out.println("Total draw is "+game2.getDraw1());
//        }
//        else {
//            System.out.println("Match is draw ");
//            System.out.println("Total draw is "+game2.getDraw1());
//        }

    }

}
