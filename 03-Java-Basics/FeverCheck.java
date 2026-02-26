import java.util.*;

public class FeverCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();
        
        if(temp >= 100){
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}
