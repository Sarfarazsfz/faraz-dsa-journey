import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n <= 1){
            System.out.print("Not a Prime");
        } else {
            for(int i=2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
                
            }
            if(isPrime){
            System.out.println("Prime");
            } else {
                System.out.println("Not a Prime");
            }
        }
    }
}