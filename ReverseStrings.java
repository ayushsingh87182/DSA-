public class ReverseStrings {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        ReverseStrings obj = new ReverseStrings();

        String input = "  the   sky   is blue  ";

        String output = obj.reverseWords(input);

        System.out.println("Input : \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }
}