import java.util.Scanner;
public class Pizza {
    public static void main(String[] args){

        //passing arguments to our method
        String pizza = bakePizza("flatBread","Mozzarella","corn and onion");
        System.out.println(pizza);
    }
    //defining a method
    static String bakePizza(String bread, String cheese){
        return bread+" Pizza with"+cheese+" Cheese";
    }
    //overloading a method
    static String bakePizza(String bread, String cheese,String toppings){
        return bread+" Pizza with "+cheese+" Cheese along with "+toppings+" toppings ";
    }
}
