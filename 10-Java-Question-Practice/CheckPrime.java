// import java.util.*;

public class CheckPrime {
    public static boolean isPrime(int n){
        // boolean isPrime = true;
        for(int i =2; i <= n-1; i++){
            if( i % n == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println(isPrime(7));
    }
}
