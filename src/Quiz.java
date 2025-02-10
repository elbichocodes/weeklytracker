import java.util.Scanner;
public class Quiz {

    public static void main(String[] args) {

        //lets create an array for questions
        // a key of answers using an array
        //a 2d array for options
        //in this program we implemented a 2D array and we understood how to use the nested loop
        Scanner scanner=new Scanner(System.in);
        String[] questions={"Q1. Who's the PMO of india?","Q2 Which planet is the hottest in our solar system","Q3 Java a good programming language?","Q4 Who's better messi or ronaldo?","Q5 Whats your fav food?"};
        String[][] options={{"1. Narendu Modu","2. Narendra Damodar Modi","3. Narendar Modi"},{"1. mars","2. venus"},{"1. Yes","2. NO"},{"1. messi","2. CR7"},{"1. Pasta","2. Pizza"}};
        int[] key={2,2,1,2,1};
        int guess;
        int sum=0;

        for(int i=0; i<questions.length;i++){ //this loop iterates through the question array for i =0 it will print Q1
            System.out.println(questions[i]);
            for(String option:options[i]) { //this loop, loops through options array for i =0 , it will print options for Q1 IMP!!!!!!!!!!!

                System.out.println(option);

            }
            System.out.print("Choose an option: ");
            guess=scanner.nextInt();
            if(guess==key[i]){
                System.out.println("Correct Answer!!!!!! \n");
                sum+=3;
            }else{
                System.out.println("Incorrect Answer :( :( \n");
                sum-=1;
            }
        }
        System.out.println("Your Total Score: "+sum);

    }
}