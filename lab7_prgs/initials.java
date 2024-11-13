//q9 lab 7
import java.util.*;
class InitialSplit 
{
    public static void main(String args[]) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String ini = "";
        for (String word : words)
        {
            ini += word.charAt(0) + ".";
        }
        if (ini.length() > 0) 
        {
            ini = ini.substring(0, ini.length() - 1);
        }
        System.out.println(ini);
    }
}
