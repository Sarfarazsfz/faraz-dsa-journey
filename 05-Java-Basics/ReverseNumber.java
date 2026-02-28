import java.util.*;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number for reversed: ");
        int n = sc.nextInt();

        int lastDigit;
        int rev = 0;

        while(n > 0){
            lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.print(rev);
    }
}
