import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        //declare variables
        int input; //this will help us decide how many dices to roll
        System.out.print("Enter the # of dices to be rolled: ");
        input=scanner.nextInt();
        int sum=0;
        if(input<0){
            System.out.println("# of dice roll cannot be 0");
        }else{
            for (int i =0; i<input;i++){
                int roll=random.nextInt(1,7);
                System.out.println("You rolled:"+roll);
                diceroller(roll);
                sum+=roll;

            }
            System.out.println("Total sum of Dice Rolls = "+sum);
        }
    }
    //lets create a method
    static void diceroller(int roll){

            String dice1="""
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                """;
        String dice2="""
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------
                """;
        String dice3="""
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
                """;
        String dice4="""
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;

        String dice5="""
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;

        String dice6="""
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;
        switch (roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default -> System.out.println("Invalid Input");

        }
    }
}
