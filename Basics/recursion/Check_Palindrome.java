import java.util.Scanner;
public class Check_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string : ");
        String str = sc.nextLine();
        String cleaned = clean_string(str);
        boolean res = check_palindrome(0, cleaned, cleaned.length());
        System.out.println(res);
        sc.close();
        
    }
    public static String clean_string(String str) {
        String newStr = str.toLowerCase();
        newStr = newStr.replaceAll("[^a-zA-Z0-9]", "");
        return newStr;
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
