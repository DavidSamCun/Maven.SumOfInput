import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        
        int n;
        int sum = 0;

        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number - ");
        n = number.nextInt();
        System.out.println("You entered: " + n);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.print("The sum of all things is " + sum);
    }
}
