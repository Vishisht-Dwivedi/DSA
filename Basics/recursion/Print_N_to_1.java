import java.util.Scanner;

public class Print_N_to_1 {
    public static void main(String[] args){
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Double parameter approach");
        f1(n,n);
        System.out.println("Single parameter approach");
        f2(n);
    }
    // double parameter approach
    public static void f1(int i, int n) {
        if(i<1) {
            return;
        } 
        System.out.println(i);
        f1(i-1,n);
    }
    // single parameter approach
    public static void f2(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        f2(n-1);
    }
}
