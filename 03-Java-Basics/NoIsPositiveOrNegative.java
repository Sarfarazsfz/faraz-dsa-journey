import java.util.*;

public class NoIsPositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // String type = ((number > 0)) ? "Positive" : "Negative";
        // System.out.println(type);
        if(number > 0){
            System.out.println("Entered No is Positive");
        } else if(number == 0){
            System.out.println(" Entered No is Equal");
        } else{
            System.out.println("Entered No is Negative");
        }
    }
}
