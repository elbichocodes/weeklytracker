
import java.util.Scanner;
public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome User: This is a program to convert temperature into desired measuring system");
        System.out.println("Choose your Temp Scale:\n1. C \n2. F");

        String input =scanner.next().toUpperCase();

        String inputChoice =(input.equals("C"))? "You have chosen Celsius to Fahrenheit \nEnter temperature value in Celsius":"You have chosen Fahrenheit to Celsius \nEnter temperature value in Fahrenheit";
        System.out.println(inputChoice);
        double temperatureValue = scanner.nextDouble();
        if(input.equals("C")){
            System.out.println("Your converted value is:"+((temperatureValue *1.8)+32)+" Fahrenheit");
        }else{
            System.out.println("Your converted value is:"+((temperatureValue-32)*5/9) +" Celsius");
        }

        scanner.close();
    }
}
