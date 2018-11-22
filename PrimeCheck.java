import java.util.*;
//Simple of checking a number is prime or not
//We are using a fact that square of every prime number when divided by 24 leaves remainder 1 .
public class PrimeCheck{


 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n<=1)System.out.println("no");
        else if (n<=3)System.out.println("yes");
        else if (n%2==0 || n%3==0)System.out.println("no");
        else if(n%24!=1)         //eliminating all multiples of 50
            if((n*n%24==1))System.out.println("yes"); //main logic
            else System.out.println("no");
        else System.out.println("no");

    }

}
