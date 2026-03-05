import java.util.*;

public class InvertedStarPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n - 1 + 1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
