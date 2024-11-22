//q6 lab8
public class WatsonCrickPalindrome 
{
    public static boolean isWatsonCrickPalindrome(String str) 
  {
        str = str.toUpperCase();
        String complement = "ATCG";
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            char leftBase = str.charAt(left);
            char rightBase = str.charAt(right);e
            char expectedComplement = complement.charAt(3 - complement.indexOf(rightBase));
            if (leftBase != expectedComplement) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter DNA:");
        String testString = sc.next();
        if (isWatsonCrickPalindrome(testString)) 
        {
            System.out.println("\"" + testString + "\" is a Watson-Crick complemented palindrome.");
        } 
        else 
        {
            System.out.println("\"" + testString + "\" is not a Watson-Crick complemented palindrome.");
        }
    }
}
