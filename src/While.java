import java.util.Scanner;
import java.util.Random;
public class While {
    public static void main(String[]args){
       //Number Guessing Game
       Scanner scanner = new Scanner(System.in);
       Random random=new Random();
       int guess;
       int attempts= 0;
       int min;
       System.out.println("Enter range start point");
       min=scanner.nextInt();
       int max;
       System.out.println("Enter range end point");
       max=scanner.nextInt();
        System.out.println("The game has started, lets play!!");
        System.out.println("Guess the number:");
       int randomNumber= random.nextInt(min,max+1);
       do{
           System.out.printf("Enter number between %d-%d \n",min,max);
           guess=scanner.nextInt();
           attempts ++;
       }while(guess!=randomNumber);

        System.out.println("You have won in "+ attempts +" attempts");

    }
}
