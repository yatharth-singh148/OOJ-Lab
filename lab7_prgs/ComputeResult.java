//q7 lab7
import java.util.*;
 public class ComputeResult {
 public static void main(String[] args) {
 String original = "software";
 StringBuffer result = new StringBuffer("hi");
 int index = original.indexOf('a');

 result.setCharAt(0, original.charAt(0));
 result.setCharAt(1, original.charAt(original.length()-1));
 result.insert(1, original.charAt(4));
 result.append(original.substring(1,4));
 result.insert(3, (original.substring(index, index+2) + " "));

 System.out.println(result);
 }
}
//OUTPUT: swear oft
