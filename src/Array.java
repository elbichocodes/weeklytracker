import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        String[] fruits = new String[4];

        for(int i=0;i<fruits.length;i++){
            System.out.print("Enter fruit name: ");
            fruits[i]=scanner.nextLine();
//            System.out.println(fruits[i]);
        }
        System.out.println("\n Fruits you entered are: ");

            System.out.print(String.join(", ",fruits));







 






        scanner.close();
    }
}
