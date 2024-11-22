//q5 lab 8
import java.util.Scanner;
public class PalindromeChecker 
{

boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String testString = sc.next();
        if (isPalindrome(testString)) 
        {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } 
        else 
        {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}
