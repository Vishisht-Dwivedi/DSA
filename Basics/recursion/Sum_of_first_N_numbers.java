import java.util.Scanner;

public class Sum_of_first_N_numbers {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = f(n);
        System.out.printf("Result is : %d",result);
        sc.close();
    }
    //functional recursion
    public static int f(int n) {
        if (n<=1) {
            return n;
        }
        return n + f(n-1);
    }
}
