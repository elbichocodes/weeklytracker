import java.util.Scanner;

public class BankingProgram {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        //let's declare variables
        //make a menu to display at output
        //define methods to read current balance()
        //deposit()
        //withdraw()

        double balance =0;
        double value=0;
        int inputChoice;
        boolean isRunning=true;
        while(isRunning){
            System.out.println("********************");
            System.out.println("Welcome to City Bank");
            System.out.println("********************");
            System.out.println("1.Current Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.print("Choose a option from (1-4): ");
            inputChoice =scanner.nextInt();
            //creating switch to reduce redundant if statements
            switch(inputChoice) {
                case 1 -> currentBalance(balance);
                case 2 -> {
                    System.out.println("Enter amount to be deposited: ");
                    value= scanner.nextDouble();
                    depositAmount(value);
                    balance=balance+value;
                }
                case 3 -> {
                    System.out.println("Enter amount to be withdrawn: ");
                    value= scanner.nextDouble();
                    if(balance>value) {
                        balance = balance - value;
                        withdrawnAmount(value);
                    }else {
                        System.out.println("InSufficient Balance , please try again!! \n\n");
                    }
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
    //creating methods
    static void  depositAmount(double value){ //deposit method
        System.out.printf("amount deposited : %.2f $ successfully\n\n ",value);

    }
    static void currentBalance(double balance){ //current balance
        System.out.printf("Current balance: %.2f $\n\n",balance);
    }
    static void withdrawnAmount(double value){
        System.out.printf("amount withdrawn : %.2f $ successfully\n\n ",value);
    }

}
