import java.util.*;
public class SquarePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 4; i++){
            for(int j = i; j<=i; j++){
                System.out.println("****");
            }
        }
    }
}
