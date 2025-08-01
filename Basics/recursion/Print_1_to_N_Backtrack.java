import java.util.Scanner;
public class Print_1_to_N_Backtrack {
    public static void main(String[] args) {
        System.out.printf("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        f(input);
    }
    // backtracking approach
    public static void f(int n) {
        if(n<1) {
            return;
        }
        f(n-1);
        System.out.println(n);
    }
}