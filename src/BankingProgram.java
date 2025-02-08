import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args){

        //let's declare variables
        //make a menu to display at output
        //define methods to read current balance()
        //deposit()
        //withdraw()

        double balance =0;
        double value=0;

        boolean isRunning=true;
        while(isRunning){
            System.out.println("********************");
            System.out.println("Welcome to City Bank");
            System.out.println("********************");
            System.out.println("1.Current Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.print("Choose a option from (1-4): ");
            int inputChoice =scanner.nextInt();
            //creating switch to reduce redundant if statements
            switch(inputChoice) {
                case 1 -> currentBalance(balance);
                case 2 -> balance+=depositAmount();
                case 3 -> balance-=withdrawnAmount(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
    //creating methods
    static double  depositAmount(){ //deposit method
        System.out.println("Enter amount to be deposited: ");
        double amount =scanner.nextDouble();
        if(amount<=0){
            System.out.println("Deposit amount cannot be zero or less, try again!!!!");
            return 0;
        }else{
            System.out.printf("amount deposited : %.2f $ successfully\n\n ",amount);
            return amount;
        }
    }
    static void currentBalance(double balance){ //current balance

        System.out.printf("Current balance: %.2f $\n\n",balance);
    }
    static double withdrawnAmount(double balance){
        System.out.println("Enter amount to be Withdrawn: ");
        double amount =scanner.nextDouble();
        if(amount<=0){
            System.out.println("Withdraw amount cannot be zero or less, try again!!!!");
            return 0;
        }else if(amount<balance){
            System.out.printf("amount withdrawn : %.2f $ successfully\n\n ",amount);
            return amount;
        }else{
            System.out.println("Insufficient Balance, Please try again later");
            return 0;
        }
    }

}
