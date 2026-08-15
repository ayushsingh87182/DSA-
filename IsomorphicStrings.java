import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST[a] != 0 && mapST[a] != b) {
                return false;
            }

            if (mapTS[b] != 0 && mapTS[b] != a) {
                return false;
            }

            mapST[a] = b;
            mapTS[b] = a;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }

        sc.close();
    }
}