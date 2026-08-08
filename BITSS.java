import java.util.Scanner;

class BITSS {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            result = (result << 1) | bit;
            n = n >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.reverseBits(n);

        System.out.println("Reversed bits: " + result);

        sc.close();
    }
}