package palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int numberSize = x == 0? 1 : (int)(Math.log10(x) + 1);
        int[] reversedDigits = new int[numberSize];
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedDigits[i] = x % 10;
            x = x / 10;
        }
        for (int i = 0; i < reversedDigits.length / 2; i++) {
            if (reversedDigits[i] != reversedDigits[numberSize - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberSize = (int)(Math.log10(11) + 1);
        System.out.println(numberSize);
    }
}
