import java.util.Scanner;
public class Switch {
    public static void main(String[]args){

        System.out.println("Welcome User: This program will be using Enhanced switch to find if a day is Weekday OR Weekend");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day:");
        String day=scanner.nextLine().toUpperCase();

        switch (day){
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"-> System.out.println("Its a Weekday ahh..");
            case "SATURDAY","SUNDAY"-> System.out.println("Its the Weekend Yay");
            default -> System.out.println("Invalid input, Please Try Again");
        }
        scanner.close();
    }
}
