import java.util.*;

public class WeekDayName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the days number b/w 1 to 7: ");
        int days = sc.nextInt();

        switch(days){
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thursday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            case 7: System.out.print("Sunday");
            break;
            default: System.out.print("You Entered No is Invalid");
        }
        
    }
}
