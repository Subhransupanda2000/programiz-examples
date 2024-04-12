import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a String");
        String a = sc.nextLine();
        System.out.println("input string");
        String b = sc.nextLine();
        if (a.length() == b.length()) {
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println("is anagram");
            } else {
                System.out.println("not a anagram");
            }

        }

    }
}
