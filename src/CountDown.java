import java.util.Scanner;
public class CountDown {
    public static void main(String[] args)  throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int count = 10;

        for (int i = count; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1100);   //Whenever you add a Thread method , you need to use a throws InterruptedException
            //The exception captures if the execution was interrupted during the Thread sleep method is active
        }
        System.out.println("We have a launch!!!!");

        //passing arguments after declaring variable

        System.out.println("Enter First Name");
        String first=scanner.nextLine();
        System.out.println("Enter Last Name");
        String last=scanner.nextLine();
        System.out.println("Enter Age:");
        int age=scanner.nextInt();
        //calling method and passing argument inside the braces
        String result=fullName(first,last,age);
        System.out.println(result);
    }
    //creating a method
    static String fullName(String first, String last,int age){
        return(first+ " "+ last + "age "+age);
    }
}
