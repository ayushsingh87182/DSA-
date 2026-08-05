public class StringOdd {

    public String largestOddNumber(String num) {
        int i = num.length() - 1;

        while (i >= 0 && (num.charAt(i) - '0') % 2 == 0) {
            i--;
        }

        return num.substring(0, i + 1);
    }

    public static void main(String[] args) {
        StringOdd o = new StringOdd();

        String num = "3540";

        String result = o.largestOddNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Largest Odd Number: " + result);
    }
}