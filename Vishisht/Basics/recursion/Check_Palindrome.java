import java.util.Scanner;
public class Check_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string : ");
        String str = sc.nextLine();
        boolean res = check_palindrome(0, str, str.length());
        if(res){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
        
    }
    public static boolean check_palindrome(int i,String s,int size){
        if(i>=size/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(size-i-1)){
            return false;
        }
        return check_palindrome(i+1, s, size);
    }
}
