import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack extends Deck
{
    public static void main(String[] args){
        boolean play = true;
        Scanner keys = new Scanner(System.in);
        while(play){
            System.out.print('\u000C');
            System.out.println("Welcome to BlackJack.");
            Deck deck = new Deck();
            int playerTotal = 0;
            int dealerTotal = 0;
            playerTotal += deck.drawRandomCard().getNumber();
            playerTotal += deck.drawRandomCard().getNumber();
            dealerTotal += deck.drawRandomCard().getNumber();
            boolean hit = true;
            boolean blackjack = false;
            if(playerTotal >= 21){
                blackjack = true;
            }
            if(!blackjack){
                System.out.println("Your total is " + playerTotal + (". Would you like to Hit or Stand (HIT/STAND)"));
                String input = keys.nextLine();
                if(input.equals("STAND")){
                    hit = false;
                }
                while(hit){
                    playerTotal += deck.drawRandomCard().getNumber();
                    if(playerTotal < 21){
                        System.out.println("Your total is " + playerTotal + (". Would you like to Hit or Stand (HIT/STAND)"));
                        input = keys.nextLine();
                    }
                    if(input.equals("STAND")){
                        hit = false; 
                    }
                    if(playerTotal >= 21){
                        System.out.println("Your total is " + playerTotal);
                        hit = false;
                    }
                }
                while(dealerTotal < 17){
                    dealerTotal += deck.drawRandomCard().getNumber();
                } 
            }
            if(playerTotal == 21){
                System.out.println("BlackJack! You Win!");
            }   
            else if(playerTotal > 21){
                System.out.println("BUST! GAME OVER");
            }
            else if(dealerTotal > 21){
                System.out.println("Dealer Bust! You Win!");
            }
            else if(dealerTotal > playerTotal){
                System.out.println("Dealer had " + dealerTotal + " and you had " + playerTotal + ". You Lose");
            }   
            else if(playerTotal < dealerTotal){
                System.out.println("You had " + playerTotal + " and the dealer had " + dealerTotal + ". You Win");
            }
            else if(playerTotal == dealerTotal){
                System.out.println("Tie game! You both had " + playerTotal);
            }
            else{
                System.out.println("Something went wrong");
            }
            System.out.println("Would you like to play again? Press N to quit");
            String input = keys.nextLine();
            if(input.equals("N")){
                play = false;
            }
        }
        System.out.println("Thanks for playing");
    }
}
