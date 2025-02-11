import  java.util.Scanner;
import  java.util.Random;

public class Game {

    public static void main(String[] args){
        //declare variables
        //This game is to play stone paper scissor
        //we will declare 2 values one which randomly guess the computers guess and one where the user chooses
        String userChoice;
        Random random=new Random();
        Scanner scanner = new Scanner(System.in);

        String[] game={"stone","paper","scissor"};



        String playAgain="yes";
        System.out.println("*************************");
        System.out.println("  Welcome to the GAME");
        System.out.println("*************************\n");


        do{
            int number =random.nextInt(3);
            String computerChoice = game[number];
            System.out.print("Enter your move (stone/paper/scissor): ");
            userChoice=scanner.nextLine().toLowerCase();

            if(!userChoice.equals("stone")&&!userChoice.equals("paper")&&!userChoice.equals("scissor")){
                System.out.println("Invalid Input");
                continue;
            } else if (userChoice.equals(computerChoice)) {
                System.out.println("Its a tie");
            }else if((userChoice.equals("paper")&& computerChoice.equals("stone"))||(userChoice.equals("stone")&& computerChoice.equals("scissor"))
                    ||(userChoice.equals("scissor")&& computerChoice.equals("paper"))){
                System.out.println("You Win !!!!!!!!!! Yayy");
            }else {
                System.out.println("OOPS!!! You Lost :( :( ");
            }
            System.out.print("Do you want to Continue (yes/no): ");
            playAgain  =scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));


        System.out.println("Thank you for playing........");

    }
}
