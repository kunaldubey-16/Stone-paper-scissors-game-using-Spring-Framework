/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_spsgame;

import java.util.*;
import org.springframework.stereotype.Component;

@Component

public class Stone_Paper_Scissor_game {

    static String round2_winner;
    static String round1_winner;
    static String round3_winner;
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    //getting random moves from computer
    public static String getComputerMove() {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        if (input == 1) {
            computermove = Stone_Paper_Scissor_game.ROCK;
        } else if (input == 2) {
            computermove = Stone_Paper_Scissor_game.PAPER;
        } else {
            computermove = Stone_Paper_Scissor_game.SCISSORS;
        }

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;
    }

    //Execution of logical concept of game
    public void game() {
        String playerMove1 = getComputerMove();
        String playerMove2 = getComputerMove();
        String playerMove3 = getComputerMove();
        String playerMove4 = getComputerMove();

        System.out.println("player 1 move is" + playerMove1);
        System.out.println("player 2 move is" + playerMove2);
        System.out.println("player 3 move is" + playerMove3);
        System.out.println("player 4 move is" + playerMove4);

        // CONSIDERING THE MOVES BETWEEN 4 PLAYERS TO BE CLOCKWISE
        if (playerMove1.equals(playerMove2)) {
            System.out.println("Match is tie between player1 & player 2");

            round1_winner = playerMove2;
            if (round1_winner.equals(playerMove3)) {

                System.out.println("Match is tie between player2 & player 3");
                round2_winner = playerMove3;
            } else {
// if round1 player is ROCK         
                if (round1_winner.equals(Stone_Paper_Scissor_game.ROCK)) {
                    if (playerMove3.equals(Stone_Paper_Scissor_game.PAPER)) {
                        System.out.println("/nplayerMove3 is winner");
                        round2_winner = playerMove3;

                    } else {
                        System.out.println("round1-winner wins");
                        round2_winner = round1_winner;
                    }

                }

// if round1 player is PAPER
                if (round1_winner.equals(Stone_Paper_Scissor_game.PAPER)) {
                    if (playerMove3.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                        System.out.println("playerMove3 is winner");
                        round2_winner = playerMove3;
                    } else {
                        System.out.println("round1-winner wins");
                        round2_winner = round1_winner;
                    }

                } // if playerMove is SCISSORS    
                else if (round1_winner.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                    if (playerMove3.equals(Stone_Paper_Scissor_game.ROCK)) {
                        System.out.println("playerMove3 is winner");
                        round2_winner = playerMove3;
                    } else {
                        System.out.println("round1-winner wins");
                        round2_winner = round1_winner;
                    }

                }

            }

            //between ROUND2_WINNER and player 4
            if (round2_winner.equals(playerMove4)) {

                System.out.println("Match is tie between winner & player 4");
                round3_winner = playerMove4;
            } else {

// if playerMove is ROCK         
                if (round2_winner.equals(Stone_Paper_Scissor_game.ROCK)) {
                    if (playerMove4.equals(Stone_Paper_Scissor_game.PAPER)) {
                        System.out.println("playerMove4 is winner");
                        round3_winner = playerMove4;
                    } else {
                        System.out.println("round2-winner wins");
                        round3_winner = round2_winner;
                    }

                }
// if playerMove is PAPER
                if (round2_winner.equals(Stone_Paper_Scissor_game.PAPER)) {
                    System.out.println("/nround 2 winner is :" + round2_winner);
                    if (playerMove4.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                        System.out.println("playerMove4 is winner");
                        round3_winner = playerMove4;
                    } else {
                        System.out.println("round2-winner wins");
                        round3_winner = round2_winner;
                    }

                    System.out.println("/nround 3 winner is :" + round3_winner);
                } // if playerMove is SCISSORS    
                else {
                    if (playerMove4.equals(Stone_Paper_Scissor_game.ROCK)) {
                        System.out.println("playerMove4 is winner");
                        round3_winner = playerMove4;
                    } else {
                        System.out.println("round2-winner wins");
                        round3_winner = round2_winner;
                    }
                }

            }

        } else {
            //first round of comparisoin 

            //if player 1 chooses rock
            if (playerMove1.equals(Stone_Paper_Scissor_game.ROCK)) {
                if (playerMove2.equals(Stone_Paper_Scissor_game.PAPER)) {
                    System.out.println("/nplayerMove3 is winner");
                    round1_winner = playerMove2;

                } else {
                    System.out.println("round1-winner wins");
                    round1_winner = playerMove1;
                }

            }

            //if player 1 chooses paper
            if (playerMove1.equals(Stone_Paper_Scissor_game.PAPER)) {
                if (playerMove2.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                    System.out.println("/nplayerMove3 is winner");
                    round1_winner = playerMove2;

                } else {
                    System.out.println("round1-winner wins");
                    round1_winner = playerMove1;
                }

            } //if player 1 chooses SCISSORS
            else if (playerMove1.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                if (playerMove2.equals(Stone_Paper_Scissor_game.ROCK)) {
                    System.out.println("/nplayerMove3 is winner");
                    round1_winner = playerMove2;

                } else {
                    System.out.println("round1-winner wins");
                    round1_winner = playerMove1;
                }

            }

            //ROUND 2 COMPARISION
            //if player 1 chooses rock
            if (round1_winner.equals(Stone_Paper_Scissor_game.ROCK)) {
                if (playerMove3.equals(Stone_Paper_Scissor_game.PAPER)) {
                    System.out.println("/nplayerMove3 is winner");
                    round2_winner = playerMove3;

                } else {
                    System.out.println("round1-winner wins");
                    round2_winner = round1_winner;
                }

            }

            //if player 1 chooses paper
            if (round1_winner.equals(Stone_Paper_Scissor_game.PAPER)) {
                if (playerMove3.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                    System.out.println("/nplayerMove3 is winner");
                    round2_winner = playerMove3;

                } else {
                    System.out.println("round2-winner wins");
                    round2_winner = round1_winner;
                }

            } //if player 1 chooses SCISSORS
            else if (round1_winner.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                if (playerMove3.equals(Stone_Paper_Scissor_game.ROCK)) {
                    System.out.println("/nplayerMove3 is winner");
                    round2_winner = playerMove3;

                } else {
                    System.out.println("round1-winner wins");
                    round2_winner = round1_winner;
                }

            }

            //round 3 comparision
            //if player 1 chooses rock
            if (round2_winner.equals(Stone_Paper_Scissor_game.ROCK)) {
                if (playerMove4.equals(Stone_Paper_Scissor_game.PAPER)) {
                    System.out.println("/nplayerMove4 is winner");
                    round3_winner = playerMove4;

                } else {
                    System.out.println("round1-winner wins");
                    round3_winner = round2_winner;
                }

            }

            //if player 1 chooses paper
            if (round2_winner.equals(Stone_Paper_Scissor_game.PAPER)) {
                if (playerMove4.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                    System.out.println("/nplayerMove4 is winner");
                    round3_winner = playerMove4;

                } else {
                    System.out.println("round2-winner wins");
                    round3_winner = round2_winner;
                }

            } //if player 1 chooses SCISSORS
            else if (round2_winner.equals(Stone_Paper_Scissor_game.SCISSORS)) {
                if (playerMove4.equals(Stone_Paper_Scissor_game.ROCK)) {
                    System.out.println("/nplayerMove4 is winner");
                    round3_winner = playerMove4;

                } else {
                    System.out.println("round1-winner wins");
                    round3_winner = round2_winner;
                }

            }

        }

        System.out.println("\nround1_winner is : " + round1_winner);
        System.out.println("\nround2_winner is :" + round2_winner);
        System.out.println("\nround3_winner is :" + round3_winner);

        System.out.println("\nfinally winner is  :" + round3_winner);

    }

}
