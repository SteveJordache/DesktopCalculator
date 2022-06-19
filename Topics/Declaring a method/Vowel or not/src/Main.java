import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char var : vowels) {
            if (Character.compare(Character.toLowerCase(ch), var) == 0) {
                return true;
            }
        } return false;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}