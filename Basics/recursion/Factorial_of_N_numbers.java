import java.util.Scanner;

public class Factorial_of_N_numbers {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = f(n);
        System.out.printf("Result is %d",result);
    }
    //functional recursion
    public static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * f(n-1);
    }
}
