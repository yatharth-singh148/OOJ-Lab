import java.util.Scanner;

public class DNAAlter 
{
    public static char complement(char base) {
        if (base == 'A') return 'T';
        if (base == 'T') return 'A';
        if (base == 'C') return 'G';
        if (base == 'G') return 'C';
        return ' ';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a DNA: ");
        String dnaString = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = dnaString.length() - 1; i >= 0; i--)
        {
            result.append(complement(dnaString.charAt(i)));
        }
        System.out.println("The reverse complement is: " + result.toString());
    }
}
